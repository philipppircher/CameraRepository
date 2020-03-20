package Schroedinger.chapter5.phil;
import otherpackage.phil.TschuessSager;

public class ReuseMethodes {

    // Schroedinger Page 174 - 179

    public static void main(String[] args) {
        // static Methode from TschuessSager
        TschuessSager.staticSagTschuess("Boss");
        TschuessSager sagwas = new TschuessSager();
        sagwas.nonStaticSagTschuess("Phil");
    }
}
