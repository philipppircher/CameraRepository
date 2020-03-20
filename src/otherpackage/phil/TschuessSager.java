package otherpackage.phil;
public class TschuessSager {

    // Schroedinger Page 172 - 173
    //
    // Instanz-Methodes
    //
    public static void staticSagTschuess(String name){
        if((name != null) && (name.startsWith("Boss"))) {
            System.out.println("Auf Wiedersehen, Herr " + name);
        } else {
            System.out.println("Tschüß " + name);
        }
    }

    public void nonStaticSagTschuess(String name){
        if((name != null) && (name.startsWith("Boss"))) {
            System.out.println("Auf Wiedersehen, Herr " + name);
        } else {
            System.out.println("Tschüß " + name);
        }
    }
}
