// Subklass Motorcykel - ärver från Fordon
public class Motorcykel extends Fordon {

    // Eget fält specifikt för Motorcykel
    private boolean harSidecar;

    // Konstruktor
    public Motorcykel(String märke, String modell, boolean harSidecar) {
        super(märke, modell); // anropar Fordon-konstruktorn
        this.harSidecar = harSidecar;
    }

    // Getter
    public boolean harSidecar() { return harSidecar; }

    // Överskuggar visaInfo() från Fordon
    @Override
    public void visaInfo() {
        super.visaInfo();
        System.out.println("Typ: Motorcykel, Sidecar: " + (harSidecar ? "Ja" : "Nej"));
    }
}
