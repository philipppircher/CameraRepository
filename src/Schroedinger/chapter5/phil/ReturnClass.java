package Schroedinger.chapter5.phil;

public class ReturnClass {
    // Schroedinger Page 181

    public static void main(String[] args) {

        System.out.println(sageWetterVoraus(1, "Türkei"));
    }

    private static double berechneSchuhgroesse(double fusslaenge){
        return (fusslaenge + 1.5) / 0.666;
    }

    private static String sageWetterVoraus(int monat, String land){
        String ausgabe;
        boolean istSchlechtWetter = true;

        if ("Deutschland".equals(land)){
            ausgabe = "Absolut nicht vorhersehbar.";
        } else if (monat >= 5 && monat <= 9){
            ausgabe = "Wahrscheinlich ganz gut.";
            istSchlechtWetter = false;
        }else {
            ausgabe = "Regen und Graupel";
        }
        wowSpielen(istSchlechtWetter);
        return  ausgabe;
    }

    private static void wowSpielen(boolean istRegen){
        if (istRegen){
            System.out.println("Spiel wow");
        }else{
            System.out.println("Geh raus spazieren");
        }
    }
}


