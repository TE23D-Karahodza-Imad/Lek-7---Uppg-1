// Basklass Fordon - gemensamma egenskaper för alla fordon
public class Fordon {

    // Instansvariabler (protected = tillgängliga i subklasser)
    protected String märke;
    protected String modell;
    protected boolean igång;

    // Konstruktor
    public Fordon(String märke, String modell) {
        this.märke = märke;
        this.modell = modell;
        this.igång = false;
    }

    // Getter-metoder
    public String getMärke() { return märke; }
    public String getModell() { return modell; }
    public boolean isIgång() { return igång; }

    // Metod: startar fordonet
    public void starta() {
        igång = true;
        System.out.println(märke + " " + modell + " startar...");
    }

    // Metod: stänger av fordonet
    public void stanna() {
        igång = false;
        System.out.println(märke + " " + modell + " stannar.");
    }

    // Metod: kör ett visst antal kilometer
    public void kör(int km) {
        if (!igång) {
            System.out.println(märke + " " + modell + " är inte igång!");
        } else {
            System.out.println(märke + " " + modell + " kör " + km + " km.");
        }
    }

    // Metod som subklasser ÖVERSKUGGAR (override)
    public void visaInfo() {
        System.out.println("Märke: " + märke + ", Modell: " + modell);
    }
}
