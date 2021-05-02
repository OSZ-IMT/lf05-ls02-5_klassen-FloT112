package Raumschiffe;
import java.util.ArrayList;


/**
 * Klasse Raumschiff wird geöffnet und die Werte innerhalb der Klasse werden erstellt
 */
public class Raumschiff {


	/**
	 * Attribute der Klasse Raumschiff werden deklariert
	 * int als Zahl
	 * String als Bezeichnung
	 * ArrayList als Liste
	 */
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemeInProzent;
	private int androidenAnzahl;
	private String schiffsname;
	public ArrayList <String> broadcastKommunikator;
	public ArrayList <Ladung> ladungsverzeichnis = new ArrayList<Ladung>();

	/**
	 * public Raumschiff = Konstruktor ist parameterlos
	 * danach folgt Konstruktor mit Parametern
	 */
	public Raumschiff() { }

	/**
	 * @param photonentorpedoAnzahl
	 * @param energieversorgungInProzent
	 * @param zustandSchildeInProzent
	 * @param zuzustandHuelleInProzent
	 * @param zustandLebenserhaltungssystemeInProzent
	 * @param anzahlDroiden
	 * @param schiffsname
	 */
	public Raumschiff
			(int photonentorpedoAnzahl,int energieversorgungInProzent,
			 int zustandSchildeInProzent,int zuzustandHuelleInProzent,
			 int zustandLebenserhaltungssystemeInProzent,int anzahlDroiden,
			 String schiffsname
			 ) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
		this.energieversorgungInProzent = energieversorgungInProzent;
		this.schildeInProzent = zustandSchildeInProzent;
		this.huelleInProzent = zuzustandHuelleInProzent;
		this.lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzent;
		this.androidenAnzahl = anzahlDroiden;
		this.schiffsname = schiffsname;
	}


	/**
	 * es folgen die Methoden Getter und Setter
	 */
	public int getPhotonentorpedoAnzahl()
	{ return this.photonentorpedoAnzahl ;
	}

	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu)
	{ this.photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
	}

	public int getEnergieversorgungInProzent()
	{ return this.energieversorgungInProzent;
	}

	public void setEnergieversorgungInProzent(int zustandEnergieversorgungInProzentNeu)
	{ this.energieversorgungInProzent = zustandEnergieversorgungInProzentNeu;
	}

	public int getSchildeInProzent()
	{ return schildeInProzent;
	}

	public void setSchildeInProzent(int zustandSchildeInProzentNeu)
	{ this.schildeInProzent = zustandSchildeInProzentNeu;
	}

	public int getHuelleInProzent()
	{ return huelleInProzent;
	}

	public void setHuelleInProzent(int zustandHuelleInProzentNeu)
	{ this.huelleInProzent = zustandHuelleInProzentNeu;
	}

	public int getLebenserhaltungssystemeInProzent()
	{ return lebenserhaltungssystemeInProzent;
	}

	public void setLebenserhaltungssystemeInProzent(int zustandLebenserhaltungssystemeInProzentNeu)
	{ this.lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzentNeu;
	}

	public int getAndroidenAnzahl()
	{ return androidenAnzahl;
	}

	public void setAndroidenAnzahl(int androidenAnzahl)
	{ this.androidenAnzahl = androidenAnzahl;
	}

	public String getSchiffsname()
	{ return schiffsname;
	}

	public void setSchiffsname(String schiffsname)
	{ this.schiffsname = schiffsname;
	}

	/**
	 *
	 * Verarbeitung, heißt dass jetzt alle ausführbaren Methoden folgen
	 */


	/**
	 *Methodenname: +addLadung
	 * ermöglicht das hinzufügen neuer Ladung in das Ladungsverzeichnis
	 * @param neueladung
	 */
	public void addLadung(Ladung neueladung)
	{
		ladungsverzeichnis.add(neueladung);
	}



	/**
	 *Methodenname: public void photonentorpedoSchiessen(Raumschiff r)
	 * Wenn es keine Torpedos gibt, wird die Nachricht "-=*Click*=-" ausgegeben.
	 * Die Torpedoanzahl wird um eins reduziert und die Nachricht wird an alle
	 * gesendet: "Photonentorpedo abgeschossen". Die Methode Treffer wird ebenfalls aufgerufen.
	 * @param r
	 */
	public void photonentorpedoSchiessen(Raumschiff r) {
		if (getPhotonentorpedoAnzahl() < 1)
		{
			String messagephotoleer = getSchiffsname() + "-=*Click*=-";
			nachrichtAnAlle(messagephotoleer);

		} else if (getPhotonentorpedoAnzahl() > 0)
		{
			setPhotonentorpedoAnzahl(getPhotonentorpedoAnzahl() - 1);
			String messagephotoabgeschossen = "Photonentorpedo abgeschossen";
			nachrichtAnAlle(messagephotoabgeschossen);
			treffer (r); }}

	/**
	 *Methodenname: phaserkanoneSchiessen
	 * @param r
	 * Energie <50 -> Der Schiffsname und die Nachricht "-=*Click*=-" wird ausgegeben
	 * Energie >50 aktuelle Energie - 50: wird die neue Energie festgelegt
	 * "Phaserkanone abgeschossen" wird ausgeben
	 */
	public void phaserkanoneSchiessen(Raumschiff r){
		if (getEnergieversorgungInProzent() < 50)
		{
			String messageenergieleernoabschuss = getSchiffsname() + "-=*Click*=-";
			nachrichtAnAlle(messageenergieleernoabschuss);

		}
		else if (getEnergieversorgungInProzent() > 50)
		{
			setEnergieversorgungInProzent(getEnergieversorgungInProzent() - 50);

			String messagephaserwurdeabgeschossen = "Phaserkanone abgeschossen";
			nachrichtAnAlle(messagephaserwurdeabgeschossen);
			treffer (r);
		}
	}

	/**
	 *Methodenname: treffer
	 * Die Methode treffer aufgerufen
	 * @param r  Das Raumschiff, dass getroffen wird, wird dann ausgegeben mit Schiffsname.
	 */
	private void treffer(Raumschiff r){
		System.out.println( r.schiffsname + " wurde getroffen! ");
		//r.ist das schiff was getroffen wird//
	}

	/**
	 *Methodenname: narichtAnAlle
	 * Es gibt eine Nachircht aus an alle.
	 */
	public void nachrichtAnAlle(String message)
	{
		System.out.println("Nachricht an Alle" + " " + message);
	}




	/**
	 *Methodenname: ladungsverzeichnisAusgeben()
	 * Das ladungsverzeichnis einer Ladung des Raumschiffs wird ausgegeben.
	 */
	public void ladungsverzeichnisAusgeben()
	{

	for(int i = 0; i<ladungsverzeichnis.size(); i++){
		System.out.println(ladungsverzeichnis.get(i).getBezeichnung() + " "
				+ ladungsverzeichnis.get(i).getMenge() );
	}
	}

	/**
	 *Methodenname: zustandRaumschiff
	 * Mit Hilfe der Attribute wird der Zustand eines Raumschiffs ausgegeben
	 */
	public void zustandRaumschiff(){

		System.out.println(
				"Aktueller Zustand des Raumschiffes:" +" "+ '\n' + '\n' +
				"Photonentorpedo Anzahl:" + " "  + photonentorpedoAnzahl + " "+ "Stueck"+  '\n' +
				"Energieversorgung in Prozent:"  +" "+ energieversorgungInProzent + "%" + '\n' +
				"Schilde in Prozent:" +" "+ schildeInProzent + "%" + '\n' +
				"Huelle in Prozent:" +" "+ huelleInProzent + "%" + '\n' +
				"Lebenserhaltungssysteme in Prozent:" + " "+ lebenserhaltungssystemeInProzent + "%" + '\n' +
				"Androiden Anzahl:" + " "+ androidenAnzahl + " "+ "Androiden"  +'\n' +
				"Schiffsname:" + " "+ schiffsname
                );
				}



	 //@param anzahlTorpedos, a //

	public void photonentorpedosEinsetzen(int anzahlTorpedos){	}

	/**
	 * Wenn Sie Anfänger sind, lassen Sie die Methode einfach so stehen. Sie wird für das Autograding benötigt.
	 * Wenn Sie Fortgeschrittener oder Experte sind, implementieren Sie die Methode entsprechend
	 * @return null
	 */
	public static ArrayList<String> eintraegeLogbuchZurueckgeben(){
		return null;
	}
	}
