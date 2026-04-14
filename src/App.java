// Uppgift lek 7 uppg 1: Arv och överskuggning
// Fordon är basklass, Bil och Motorcykel är subklasser

public class App {
    public static void main(String[] args) {

        // Skapa objekt av subklasserna
        Bil bil = new Bil("Volvo", "XC90", 5);
        Motorcykel mc = new Motorcykel("Harley-Davidson", "Sportster", false);

        // Testa överskuggade metoder (polymorfism)
        System.out.println("=== Information om fordon ===");
        bil.visaInfo();
        System.out.println();
        mc.visaInfo();

        System.out.println();

        // Testa gemensamma metoder från basklassen Fordon
        System.out.println("=== Starta och köra ===");
        bil.starta();
        bil.kör(100);
        bil.stanna();

        System.out.println();

        mc.starta();
        mc.kör(200);
        mc.stanna();

        System.out.println();

        // Testa subklassspecifika metoder
        System.out.println("=== Specifika metoder ===");
        System.out.println("Bil - antal dörrar: " + bil.getAntalDörrar());
        System.out.println("MC - sidecar: " + (mc.harSidecar() ? "Ja" : "Nej"));
    }
}
