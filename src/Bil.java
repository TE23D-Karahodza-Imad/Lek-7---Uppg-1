// Subklass Bil - ärver från Fordon
public class Bil extends Fordon {

    // Egna instansvariabler specifika för Bil
    private int antalDörrar;

    // Konstruktor - anropar superklassens konstruktor med super()
    public Bil(String märke, String modell, int antalDörrar) {
        super(märke, modell); // anropar Fordon-konstruktorn
        this.antalDörrar = antalDörrar;
    }

    // Getter
    public int getAntalDörrar() { return antalDörrar; }

    // Överskuggar visaInfo() från Fordon
    @Override
    public void visaInfo() {
        super.visaInfo(); // anropar basklassens metod
        System.out.println("Typ: Bil, Antal dörrar: " + antalDörrar);
    }
}
