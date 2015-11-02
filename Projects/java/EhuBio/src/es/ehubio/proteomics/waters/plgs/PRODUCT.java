//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.16 at 04:53:00 PM CET 
//


package es.ehubio.proteomics.waters.plgs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BY_INDEX" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BY_TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="CHARGE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DB_MHPLUS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DRIFT" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DRIFT_ERROR" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="HE_EMRT_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="INTENSITY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="LOSS_TYPE" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="MASS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MASS_ERROR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="MASS_ERROR_PPM" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RETENTION_TIME" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="RT_ERROR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PRODUCT")
public class PRODUCT {

    @XmlAttribute(name = "BY_INDEX", required = true)
    protected BigInteger byindex;
    @XmlAttribute(name = "BY_TYPE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String bytype;
    @XmlAttribute(name = "CHARGE", required = true)
    protected BigDecimal charge;
    @XmlAttribute(name = "DB_MHPLUS", required = true)
    protected BigDecimal dbmhplus;
    @XmlAttribute(name = "DRIFT")
    protected BigDecimal drift;
    @XmlAttribute(name = "DRIFT_ERROR")
    protected BigDecimal drifterror;
    @XmlAttribute(name = "HE_EMRT_ID", required = true)
    protected BigInteger heemrtid;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "INTENSITY", required = true)
    protected BigDecimal intensity;
    @XmlAttribute(name = "LOSS_TYPE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String losstype;
    @XmlAttribute(name = "MASS", required = true)
    protected BigDecimal mass;
    @XmlAttribute(name = "MASS_ERROR", required = true)
    protected BigDecimal masserror;
    @XmlAttribute(name = "MASS_ERROR_PPM", required = true)
    protected BigDecimal masserrorppm;
    @XmlAttribute(name = "RETENTION_TIME", required = true)
    protected BigDecimal retentiontime;
    @XmlAttribute(name = "RT_ERROR", required = true)
    protected BigDecimal rterror;

    /**
     * Gets the value of the byindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBYINDEX() {
        return byindex;
    }

    /**
     * Sets the value of the byindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBYINDEX(BigInteger value) {
        this.byindex = value;
    }

    /**
     * Gets the value of the bytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYTYPE() {
        return bytype;
    }

    /**
     * Sets the value of the bytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYTYPE(String value) {
        this.bytype = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHARGE() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHARGE(BigDecimal value) {
        this.charge = value;
    }

    /**
     * Gets the value of the dbmhplus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDBMHPLUS() {
        return dbmhplus;
    }

    /**
     * Sets the value of the dbmhplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDBMHPLUS(BigDecimal value) {
        this.dbmhplus = value;
    }

    /**
     * Gets the value of the drift property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRIFT() {
        return drift;
    }

    /**
     * Sets the value of the drift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRIFT(BigDecimal value) {
        this.drift = value;
    }

    /**
     * Gets the value of the drifterror property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRIFTERROR() {
        return drifterror;
    }

    /**
     * Sets the value of the drifterror property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRIFTERROR(BigDecimal value) {
        this.drifterror = value;
    }

    /**
     * Gets the value of the heemrtid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHEEMRTID() {
        return heemrtid;
    }

    /**
     * Sets the value of the heemrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHEEMRTID(BigInteger value) {
        this.heemrtid = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTENSITY() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTENSITY(BigDecimal value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the losstype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOSSTYPE() {
        return losstype;
    }

    /**
     * Sets the value of the losstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOSSTYPE(String value) {
        this.losstype = value;
    }

    /**
     * Gets the value of the mass property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMASS() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMASS(BigDecimal value) {
        this.mass = value;
    }

    /**
     * Gets the value of the masserror property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMASSERROR() {
        return masserror;
    }

    /**
     * Sets the value of the masserror property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMASSERROR(BigDecimal value) {
        this.masserror = value;
    }

    /**
     * Gets the value of the masserrorppm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMASSERRORPPM() {
        return masserrorppm;
    }

    /**
     * Sets the value of the masserrorppm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMASSERRORPPM(BigDecimal value) {
        this.masserrorppm = value;
    }

    /**
     * Gets the value of the retentiontime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRETENTIONTIME() {
        return retentiontime;
    }

    /**
     * Sets the value of the retentiontime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRETENTIONTIME(BigDecimal value) {
        this.retentiontime = value;
    }

    /**
     * Gets the value of the rterror property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRTERROR() {
        return rterror;
    }

    /**
     * Sets the value of the rterror property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRTERROR(BigDecimal value) {
        this.rterror = value;
    }

}