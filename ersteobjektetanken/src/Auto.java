
public class Auto {
	// Attribute = Eigenschaften
	private String marke;			// Der Modifizierer private blockt den Zugriff von au�erhalb der Klasse
	private String modell;
	private String serienNummer;
	private int kw;
	private int hubRaum;
	private int anzahlSitze;	// Wenn wir keinen Wert setzen, wird standardm��ig 0 eingetragen
	private double tankVolumen = 60;
	private double tankStand;
	private double verbrauch = 8;
	private double reichweite;
	private String passwort = "SuperGeheimesPasswort";

	// Methoden = F�higkeiten

	// void = kein R�ckgabewert
	void druckeMarkeUndModell() {
		System.out.println(marke + " " + modell);
		System.out.println(serienNummer);
	}

	// In die Klammern () schreiben wir Parameter
	// Parameter m�ssen beim Aufruf der Funktion �bergeben werden
	// und sind nur in der Methode verf�gbar
	void setzeAttribute(String marke, String modell, String serienNummer, double tankVolumen, double verbrauch, int kw,
			int hubRaum, int anzahlSitze) {
		// Parameter sind nur innerhalb der Methode verf�gbar!
		// Parameter M�SSEN �bergeben werden, wenn sie erwartet werden

		this.modell = modell;
		this.marke = marke;
		this.serienNummer = serienNummer;
		this.tankVolumen = tankVolumen;
		this.verbrauch = verbrauch;
		this.kw = kw;
		if (anzahlSitze >= 2 && anzahlSitze <= 9)
			this.anzahlSitze = anzahlSitze; 
		if (hubRaum > 0)
			this.hubRaum = hubRaum;
	}

	void fahre() {
		// nimmt Strecke in Kilometer an
		// Berechnet tankstand neu
		// Nutzen sie dazu den verbrauch

	}

	void berechneReichweite() {
		// Tank 100l
		// Verbrauch 10l / 100km
		// Reichweite => 100l / 10l = 10 10*100km = 1000km

		// Tank 60
		// Verbrauch 5l / 100km
		// Reichweite => 60l / 5l = 12 12*100km = 1200km

		this.reichweite = this.tankVolumen / this.verbrauch * 100;
	}

	void druckeReichweite() {
		System.out.println("Reichweite: " + reichweite + " km");
	}

	void druckeInfo() {
		druckeMarkeUndModell();
		berechneReichweite();
		System.out.println("Anzahl Size: " + this.anzahlSitze);
		System.out.println("Leistung: " + this.kw + " kw");
		System.out.println("Hubraum: " + this.hubRaum + " cm3");
		System.out.println("Tankvolumen: " + this.tankVolumen + " l");
		System.out.println("Verbrauch: " + this.verbrauch + "l/100 km");
		druckeReichweite();
		System.out.println();
	}
	
	void druckeSerienNummer() {
		System.out.println(this.serienNummer);
	}
	
	void druckeMarke() {
		System.out.println(this.marke);
	}
	
	void druckeModell() {
		System.out.println(this.modell);
	}
	
	void druckeKw() {
		System.out.println(this.kw);
	}
	
	void druckeAnzahlSitze() {
		System.out.println(this.anzahlSitze);
	}
	
	// Get Methode oder Getter genannt
	// Wird genutzt um gekapselte Daten, also private Daten, 
	// nach au�en weiterzureichen.
	// String R�ckgabewert bedeutet, dass wir einen String zur�ckgeben m�ssen.
	String getSerienNummer() {
		// R�ckgaben werden mit return get�tigt
		return this.serienNummer;
	}
	// void gestattet keinen R�ckgabewert
	
	// Getter f�r Anzahl Sitze
	int getAnzahlSitze() {
		return this.anzahlSitze;
	}
	
	// Set Methode oder Setter genannt
	// Wird genutzt um gekapselte Daten, also private Daten, 
	// von au�en zu ver�ndern.
	// Setter haben keinen R�ckgabetyp, also void. 
	void setKw(int kw) {
		this.kw = kw;
	}
	
	// Getter f�r KW
	int getKw() {
		return this.kw;
	}
	
	// Fehler auslesen
	String fehlerAuslesen(String passwort) {
		if(this.passwort.equals(passwort))
		return "Keine Fehler";
		else 
		return "Passwort falsch!";
	}
	
	void tanken (double kraftstoffmenge) {
		if ((this.tankStand + kraftstoffmenge) > tankVolumen) {
			System.out.println("Tank ist zu voll!");
			this.tankStand = tankVolumen;
		} else {
			this.tankStand += kraftstoffmenge;
		}
		System.out.println( "F�llstand: " + this.tankStand);
	}
	
	
	
	
}
