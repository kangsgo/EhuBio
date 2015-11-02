package es.ehubio.proteomics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import es.ehubio.model.ProteinModificationType;
import es.ehubio.proteomics.MsMsData;
import es.ehubio.proteomics.Peptide;
import es.ehubio.proteomics.Protein;
import es.ehubio.proteomics.Psm;
import es.ehubio.proteomics.Ptm;
import es.ehubio.proteomics.Score;
import es.ehubio.proteomics.ScoreType;
import es.ehubio.proteomics.Spectrum;

public class MascotDat extends MsMsFile {

	@Override
	public String getFilenameExtension() {
		return "dat";
	}

	@Override
	protected boolean checkSignatureStream(InputStream input) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		return br.readLine().toLowerCase().contains("mascot version");
	}
	
	@Override
	protected MsMsData loadStream(InputStream input, boolean loadFragments) throws Exception {				
		Map<String, Spectrum> mapSpectra = new HashMap<>();
		Map<String, Peptide> mapPeptide = new HashMap<>();
		Map<String, Protein> mapProtein = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		String mgf = getMgf(br);
		Map<String, Integer> mapCharges = loadCharges(br);
		String line;
		String[] fields;
		int count = 0;
		while( (line=br.readLine()) != null ) {
			if( !mapSpectra.isEmpty() && line.startsWith("--") )
				break;
			if( line.length() < 20 || line.charAt(0) != 'q' || !Character.isDigit(line.charAt(1)) )
				continue;
			fields = line.split("_");
			if( fields.length != 2 )
				continue;
			String query = fields[0].substring(1);			
			Spectrum spectrum = getSpectrum(query, mgf, mapSpectra);
			fields = fields[1].split("=");
			int rank = Integer.parseInt(fields[0].substring(1));
			fields = fields[1].split(";");
			Peptide peptide = getPeptide(fields[0], mapPeptide);
			if( peptide == null ) {
				count++;
				continue;
			}
			Psm psm = getPsm(rank,mapCharges.get(query),fields[0]);
			psm.linkSpectrum(spectrum);
			psm.linkPeptide(peptide);
			for( String protLine : fields[1].split(",") ) {
				Protein protein = getProtein(protLine, mapProtein);
				protein.linkPeptide(peptide);
			}
		}
		if( count != 0 )
			logger.warning(String.format("Ignored %d peptides with [bjzx] ...", count));
		MsMsData data = new MsMsData();
		data.loadFromSpectra(mapSpectra.values());
		return data;
	}

	private Map<String, Integer> loadCharges(BufferedReader br) throws IOException {
		Map<String, Integer> mapCharges = new HashMap<>();
		String line, charge;
		String[] fields;
		while( (line=br.readLine()) != null ) {
			if( !mapCharges.isEmpty() && line.startsWith("--") )
				break;
			if( !line.startsWith("qexp") )
				continue;
			fields = line.split("=");
			charge = fields[1].split(",")[1];
			mapCharges.put(fields[0].substring(4), Integer.parseInt(charge.substring(0, charge.length()-1)));
		}
		return mapCharges;
	}

	private Psm getPsm(int rank, Integer charge, String str) {
		String[] fields = str.split(",");
		Psm psm = new Psm();
		psm.setRank(rank);
		psm.setScore(new Score(ScoreType.MASCOT_SCORE, Double.parseDouble(fields[7])));
		if( charge != null )
			psm.setCharge(charge);
		return psm;
	}

	private Protein getProtein(String protLine, Map<String, Protein> mapProtein) {
		String[] fields = protLine.split(":");
		String acc = fields[0].replaceAll("[ \\t\"]", "");
		Protein protein = mapProtein.get(acc);
		if( protein != null )
			return protein;
		protein = new Protein();
		protein.setAccession(acc);
		mapProtein.put(acc, protein);
		return protein;
	}

	private Peptide getPeptide(String pepLine, Map<String, Peptide> mapPeptide) {
		String[] fields = pepLine.split(",");		
		String seq = fields[4];
		if( seq.toLowerCase().matches(".*[bjzx].*") )
			return null;
		Peptide newPeptide = new Peptide();
		newPeptide.setSequence(seq);
		String mods = fields[6];
		if( mods.charAt(0) == 1 || mods.endsWith("1") )
			throw new UnsupportedOperationException("Terminal modifications not supported");
		for( int i = 1; i < mods.length()-1; i++ ) {
			if( mods.charAt(i) == '0' )
				continue;			
			if( Character.toLowerCase(seq.charAt(i-1)) != 'm' )
				throw new UnsupportedOperationException("Only oxidation of methionine is supported");
			Ptm ptm = new Ptm();
			ptm.setPosition(i);
			ptm.setType(ProteinModificationType.OXIDATION);
			ptm.guessMissing(seq);
			newPeptide.addPtm(ptm);
		}
		Peptide peptide = mapPeptide.get(newPeptide.getUniqueString());
		if( peptide != null )
			return peptide;
		mapPeptide.put(newPeptide.getUniqueString(), newPeptide);
		return newPeptide;
	}

	private Spectrum getSpectrum(String query, String mgf, Map<String, Spectrum> mapSpectra) {
		Spectrum spectrum = mapSpectra.get(query);
		if( spectrum != null )
			return spectrum;
		spectrum = new Spectrum();
		spectrum.setFileName(mgf);
		spectrum.setFileId(query);
		spectrum.setScan(query);
		mapSpectra.put(query, spectrum);
		return spectrum;
	}

	private String getMgf(BufferedReader br) throws IOException {
		String line;
		while( (line=br.readLine()) != null )
			if( line.startsWith("FILE=") )
				return line.split("=")[1];
		return null;
	}
	
	 private static final Logger logger = Logger.getLogger(MascotDat.class.getName());
}