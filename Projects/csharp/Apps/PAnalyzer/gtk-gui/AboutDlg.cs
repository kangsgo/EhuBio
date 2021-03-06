
// This file has been generated by the GUI designer. Do not modify.

public partial class AboutDlg
{
	private global::Gtk.VBox vbox2;
	private global::Gtk.Frame frame2;
	private global::Gtk.Alignment GtkAlignment1;
	private global::Gtk.Label VersionLabel;
	private global::Gtk.Label GtkLabel1;
	private global::Gtk.Frame frame3;
	private global::Gtk.Alignment GtkAlignment2;
	private global::Gtk.Label LicenseLabel;
	private global::Gtk.Label GtkLabel2;
	private global::Gtk.Frame frame4;
	private global::Gtk.Alignment GtkAlignment3;
	private global::Gtk.Label CopyrightLabel;
	private global::Gtk.Label GtkLabel3;
	private global::Gtk.Frame frame1;
	private global::Gtk.Alignment GtkAlignment4;
	private global::Gtk.VBox vbox3;
	private global::Gtk.Label label2;
	private global::Gtk.Label label3;
	private global::Gtk.Label label4;
	private global::Gtk.Label label5;
	private global::Gtk.Label GtkLabel4;
	private global::Gtk.Button buttonCancel;
	
	protected virtual void Build ()
	{
		global::Stetic.Gui.Initialize (this);
		// Widget AboutDlg
		this.Name = "AboutDlg";
		this.Title = global::Mono.Unix.Catalog.GetString ("About PAnalyzer ...");
		this.Icon = global::Stetic.IconLoader.LoadIcon (this, "gtk-about", global::Gtk.IconSize.Menu);
		this.WindowPosition = ((global::Gtk.WindowPosition)(4));
		// Internal child AboutDlg.VBox
		global::Gtk.VBox w1 = this.VBox;
		w1.Name = "dialog1_VBox";
		w1.BorderWidth = ((uint)(11));
		// Container child dialog1_VBox.Gtk.Box+BoxChild
		this.vbox2 = new global::Gtk.VBox ();
		this.vbox2.Name = "vbox2";
		this.vbox2.Spacing = 10;
		// Container child vbox2.Gtk.Box+BoxChild
		this.frame2 = new global::Gtk.Frame ();
		this.frame2.Name = "frame2";
		this.frame2.ShadowType = ((global::Gtk.ShadowType)(2));
		this.frame2.LabelYalign = 0F;
		// Container child frame2.Gtk.Container+ContainerChild
		this.GtkAlignment1 = new global::Gtk.Alignment (0F, 0F, 1F, 1F);
		this.GtkAlignment1.Name = "GtkAlignment1";
		this.GtkAlignment1.LeftPadding = ((uint)(12));
		// Container child GtkAlignment1.Gtk.Container+ContainerChild
		this.VersionLabel = new global::Gtk.Label ();
		this.VersionLabel.Name = "VersionLabel";
		this.VersionLabel.Xalign = 0F;
		this.VersionLabel.LabelProp = global::Mono.Unix.Catalog.GetString ("PAnalyzer vX.Y");
		this.GtkAlignment1.Add (this.VersionLabel);
		this.frame2.Add (this.GtkAlignment1);
		this.GtkLabel1 = new global::Gtk.Label ();
		this.GtkLabel1.WidthRequest = 66;
		this.GtkLabel1.HeightRequest = 48;
		this.GtkLabel1.Name = "GtkLabel1";
		this.GtkLabel1.LabelProp = global::Mono.Unix.Catalog.GetString ("<b>Version</b>");
		this.GtkLabel1.UseMarkup = true;
		this.frame2.LabelWidget = this.GtkLabel1;
		this.vbox2.Add (this.frame2);
		global::Gtk.Box.BoxChild w4 = ((global::Gtk.Box.BoxChild)(this.vbox2 [this.frame2]));
		w4.Position = 0;
		w4.Expand = false;
		w4.Fill = false;
		// Container child vbox2.Gtk.Box+BoxChild
		this.frame3 = new global::Gtk.Frame ();
		this.frame3.Name = "frame3";
		this.frame3.ShadowType = ((global::Gtk.ShadowType)(2));
		this.frame3.LabelYalign = 0F;
		// Container child frame3.Gtk.Container+ContainerChild
		this.GtkAlignment2 = new global::Gtk.Alignment (0F, 0F, 1F, 1F);
		this.GtkAlignment2.Name = "GtkAlignment2";
		this.GtkAlignment2.LeftPadding = ((uint)(12));
		// Container child GtkAlignment2.Gtk.Container+ContainerChild
		this.LicenseLabel = new global::Gtk.Label ();
		this.LicenseLabel.Name = "LicenseLabel";
		this.LicenseLabel.Xalign = 0F;
		this.LicenseLabel.LabelProp = global::Mono.Unix.Catalog.GetString ("Released under the GNU General Public License");
		this.GtkAlignment2.Add (this.LicenseLabel);
		this.frame3.Add (this.GtkAlignment2);
		this.GtkLabel2 = new global::Gtk.Label ();
		this.GtkLabel2.WidthRequest = 67;
		this.GtkLabel2.HeightRequest = 48;
		this.GtkLabel2.Name = "GtkLabel2";
		this.GtkLabel2.LabelProp = global::Mono.Unix.Catalog.GetString ("<b>License</b>");
		this.GtkLabel2.UseMarkup = true;
		this.frame3.LabelWidget = this.GtkLabel2;
		this.vbox2.Add (this.frame3);
		global::Gtk.Box.BoxChild w7 = ((global::Gtk.Box.BoxChild)(this.vbox2 [this.frame3]));
		w7.Position = 1;
		w7.Expand = false;
		w7.Fill = false;
		// Container child vbox2.Gtk.Box+BoxChild
		this.frame4 = new global::Gtk.Frame ();
		this.frame4.Name = "frame4";
		this.frame4.ShadowType = ((global::Gtk.ShadowType)(2));
		this.frame4.LabelYalign = 0F;
		// Container child frame4.Gtk.Container+ContainerChild
		this.GtkAlignment3 = new global::Gtk.Alignment (0F, 0F, 1F, 1F);
		this.GtkAlignment3.Name = "GtkAlignment3";
		this.GtkAlignment3.LeftPadding = ((uint)(12));
		// Container child GtkAlignment3.Gtk.Container+ContainerChild
		this.CopyrightLabel = new global::Gtk.Label ();
		this.CopyrightLabel.Name = "CopyrightLabel";
		this.CopyrightLabel.Xalign = 0F;
		this.CopyrightLabel.LabelProp = global::Mono.Unix.Catalog.GetString ("(c) 2010 by UPV/EHU");
		this.GtkAlignment3.Add (this.CopyrightLabel);
		this.frame4.Add (this.GtkAlignment3);
		this.GtkLabel3 = new global::Gtk.Label ();
		this.GtkLabel3.WidthRequest = 86;
		this.GtkLabel3.HeightRequest = 48;
		this.GtkLabel3.Name = "GtkLabel3";
		this.GtkLabel3.LabelProp = global::Mono.Unix.Catalog.GetString ("<b>Copyright</b>");
		this.GtkLabel3.UseMarkup = true;
		this.frame4.LabelWidget = this.GtkLabel3;
		this.vbox2.Add (this.frame4);
		global::Gtk.Box.BoxChild w10 = ((global::Gtk.Box.BoxChild)(this.vbox2 [this.frame4]));
		w10.Position = 2;
		w10.Expand = false;
		w10.Fill = false;
		// Container child vbox2.Gtk.Box+BoxChild
		this.frame1 = new global::Gtk.Frame ();
		this.frame1.Name = "frame1";
		this.frame1.ShadowType = ((global::Gtk.ShadowType)(2));
		this.frame1.LabelYalign = 0F;
		// Container child frame1.Gtk.Container+ContainerChild
		this.GtkAlignment4 = new global::Gtk.Alignment (0F, 0F, 1F, 1F);
		this.GtkAlignment4.Name = "GtkAlignment4";
		this.GtkAlignment4.LeftPadding = ((uint)(12));
		// Container child GtkAlignment4.Gtk.Container+ContainerChild
		this.vbox3 = new global::Gtk.VBox ();
		this.vbox3.Name = "vbox3";
		this.vbox3.Spacing = 6;
		// Container child vbox3.Gtk.Box+BoxChild
		this.label2 = new global::Gtk.Label ();
		this.label2.Name = "label2";
		this.label2.Xalign = 0F;
		this.label2.LabelProp = global::Mono.Unix.Catalog.GetString ("<i><a href=\"mailto:gorka.prieto@ehu.es\">Dr. Gorka Prieto &lt;gorka.prieto@ehu.es&gt;</a></i>\n<i>Department of Electronics and Telecommunications</i>");
		this.label2.UseMarkup = true;
		this.vbox3.Add (this.label2);
		global::Gtk.Box.BoxChild w11 = ((global::Gtk.Box.BoxChild)(this.vbox3 [this.label2]));
		w11.Position = 0;
		w11.Expand = false;
		w11.Fill = false;
		// Container child vbox3.Gtk.Box+BoxChild
		this.label3 = new global::Gtk.Label ();
		this.label3.Name = "label3";
		this.label3.Xalign = 0F;
		this.label3.LabelProp = global::Mono.Unix.Catalog.GetString ("<i><a href=\"mailto:kerman.aloria@ehu.es\">Dr. Kerman Aloria &lt;kerman.aloria@ehu.es&gt;</a></i>\n<i>Proteomics Core Facility-SGIKER</i>");
		this.label3.UseMarkup = true;
		this.vbox3.Add (this.label3);
		global::Gtk.Box.BoxChild w12 = ((global::Gtk.Box.BoxChild)(this.vbox3 [this.label3]));
		w12.Position = 1;
		w12.Expand = false;
		w12.Fill = false;
		// Container child vbox3.Gtk.Box+BoxChild
		this.label4 = new global::Gtk.Label ();
		this.label4.Name = "label4";
		this.label4.Xalign = 0F;
		this.label4.LabelProp = global::Mono.Unix.Catalog.GetString ("<i><a href=\"mailto:jm.arizmendi@ehu.es\">Prof. Jesús Mari Arizmendi &lt;jm.arizmendi@ehu.es&gt;</a></i>\n<i>Department of Biochemistry and Molecular Biology</i>");
		this.label4.UseMarkup = true;
		this.vbox3.Add (this.label4);
		global::Gtk.Box.BoxChild w13 = ((global::Gtk.Box.BoxChild)(this.vbox3 [this.label4]));
		w13.Position = 2;
		w13.Expand = false;
		w13.Fill = false;
		// Container child vbox3.Gtk.Box+BoxChild
		this.label5 = new global::Gtk.Label ();
		this.label5.Name = "label5";
		this.label5.Xalign = 0F;
		this.label5.LabelProp = global::Mono.Unix.Catalog.GetString ("<i><a href=\"mailto:asier.fullaondo@ehu.es\">Dr. Asier Fullaondo &lt;asier.fullaondo@ehu.es&gt;</a></i>\n<i>Department of Genetics, Physical Anthropology and Animal\nPhysiology</i>");
		this.label5.UseMarkup = true;
		this.vbox3.Add (this.label5);
		global::Gtk.Box.BoxChild w14 = ((global::Gtk.Box.BoxChild)(this.vbox3 [this.label5]));
		w14.Position = 3;
		w14.Expand = false;
		w14.Fill = false;
		this.GtkAlignment4.Add (this.vbox3);
		this.frame1.Add (this.GtkAlignment4);
		this.GtkLabel4 = new global::Gtk.Label ();
		this.GtkLabel4.WidthRequest = 71;
		this.GtkLabel4.HeightRequest = 48;
		this.GtkLabel4.Name = "GtkLabel4";
		this.GtkLabel4.LabelProp = global::Mono.Unix.Catalog.GetString ("<b>Authors</b>");
		this.GtkLabel4.UseMarkup = true;
		this.frame1.LabelWidget = this.GtkLabel4;
		this.vbox2.Add (this.frame1);
		global::Gtk.Box.BoxChild w17 = ((global::Gtk.Box.BoxChild)(this.vbox2 [this.frame1]));
		w17.Position = 3;
		w17.Expand = false;
		w17.Fill = false;
		w1.Add (this.vbox2);
		global::Gtk.Box.BoxChild w18 = ((global::Gtk.Box.BoxChild)(w1 [this.vbox2]));
		w18.Position = 0;
		w18.Expand = false;
		w18.Fill = false;
		// Internal child AboutDlg.ActionArea
		global::Gtk.HButtonBox w19 = this.ActionArea;
		w19.Name = "dialog1_ActionArea";
		w19.Spacing = 10;
		w19.BorderWidth = ((uint)(5));
		w19.LayoutStyle = ((global::Gtk.ButtonBoxStyle)(4));
		// Container child dialog1_ActionArea.Gtk.ButtonBox+ButtonBoxChild
		this.buttonCancel = new global::Gtk.Button ();
		this.buttonCancel.CanDefault = true;
		this.buttonCancel.CanFocus = true;
		this.buttonCancel.Name = "buttonCancel";
		this.buttonCancel.UseStock = true;
		this.buttonCancel.UseUnderline = true;
		this.buttonCancel.Label = "gtk-ok";
		this.AddActionWidget (this.buttonCancel, -5);
		global::Gtk.ButtonBox.ButtonBoxChild w20 = ((global::Gtk.ButtonBox.ButtonBoxChild)(w19 [this.buttonCancel]));
		w20.Expand = false;
		w20.Fill = false;
		if ((this.Child != null)) {
			this.Child.ShowAll ();
		}
		this.DefaultWidth = 495;
		this.DefaultHeight = 551;
		this.Show ();
	}
}
