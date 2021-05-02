package Raumschiffe;
import java.util.ArrayList;

/**
 * Diese Klasse enthält die Mainmethode und startet das Programm
 * @author Florian Thiem
 * @version 02.05.2021
 */
public class TestStarTrek {


	public static void main(String[] args) {

		Ladung l= new Ladung() {};

		// komplexer Datentyp Raumschiff "r = Name" = neues Objekt Raumschiff mit Parameter()


		/**Raumschiffe werden erstellt*/

		//Klingonenraumschiff
		Raumschiff r1 = new Raumschiff(
				1,
				100,
				100,
				100,
				100,
				2,
				"IKS Hegh'ta");

		//test//


		r1.addLadung(new Ladung("Ferengi Schneckensaft",200));
		r1.addLadung(new Ladung("Ferengi Schneckensaft",200));
		r1.addLadung(new Ladung("Bat'leth Klingonen Schwert",200));


		/**Raumschiff der Romulaner*/
		Raumschiff r2 = new Raumschiff(
				2,
				100,
				100,
				100,
				100,
				2,
				"IRW Khazara");

		/**Ladung beim Start bei den Romulanern*/
		r2.addLadung(new Ladung("Borg-Schrott",5));
		r2.addLadung(new Ladung("Rote Materie",2));
		r2.addLadung(new Ladung("Plasma-Waffe",50));

		/**Raumschiff der Vulkanier*/
		Raumschiff r3 = new Raumschiff(
				0,
				80,
				80,
				50,
				100,
				5,
				"NiVar");

		r3.addLadung(new Ladung("Forschungssonde",35));
		r3.addLadung(new Ladung("Photonentorpedo",3));




		/**Verarbeitung*/

		/**Klingonen schießen auf die Romulaner mit Photonentorpedos, aber nur ein Mal.*/
		r1.photonentorpedoSchiessen(r2);

		/**Romulaner erwidern mit Phaserkanonen das Feuer.*/
		r2.phaserkanoneSchiessen(r1);

		/**Vulkanier senden Nachricht: “Gewalt ist nicht logisch” an alle anderen.*/
		r3.nachrichtAnAlle("Gewalt ist nicht logisch");

		/**Klingonen lassen Ladungsverzeichnis ausgeben und rufen den Raumschiffzustand aus.*/
		r1.zustandRaumschiff();
		r1.ladungsverzeichnisAusgeben();

		/**Klingonen schießen auf die Romulaner mit zwei weiteren Photonentorpedo.*/
		r1.photonentorpedoSchiessen(r2);
		r1.photonentorpedoSchiessen(r2);

		/**Alle drei geben*/
		/**ihr Ladungsverzeichnis aus und der Zustand der Raumschiffe wird jeweils aufgerufen*/

		r1.zustandRaumschiff();
		r1.ladungsverzeichnisAusgeben();

		r2.zustandRaumschiff();
		r2.ladungsverzeichnisAusgeben();

		r3.zustandRaumschiff();
		r3.ladungsverzeichnisAusgeben();

	}}
