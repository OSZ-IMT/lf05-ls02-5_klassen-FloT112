package Raumschiffe;


public class Ladung {
    /**
     *  //Generieren der Attribute bezeichnung und Menge
     */

    private String bezeichnung;
    private int menge;

    /**
     *  //Der Konstruktor ist leer
     */

    public Ladung() {}

    /**
     *  // Der parametisierte Konstruktor
     */

    public Ladung  (String bezeichnung,int menge)
    { this.bezeichnung = bezeichnung; this.menge = menge; }


    /**
     *  //Getter und Setter
     */

    public void   setBezeichnung(String name) { this.bezeichnung = name; }
    public String getBezeichnung() { return bezeichnung; }

    public void setMenge(int menge) { this.menge = menge;}
    public int getMenge() { return menge; }


}
