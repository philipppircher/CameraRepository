package Schroedinger.chapter5.phil;

public class RefactoringLotto {

    // Schroedinger Page 174 - 179

    public static void main(String[] args) {
        int zahl1 = 5,
                zahl2 = 2,
                zahl3 = 1,
                zahl4 = 12,
                zahl5 = 46,
                zahl6 = 15,
                zahl7 = 26;

        druckeLottoschein(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7);
    }

    private static void druckeLottoschein(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6, int zahl7) {
        for (int i = 1; i <= 49; i++) {
            druckeLottoscheinKästchen(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7, i);
            testeUndDruckeNeueZeile(i);
        }
    }

    /**
     *
     * @param zahl1     First int value
     * @param zahl2     Second int value
     * @param zahl3     Third int value
     * @param zahl4     Fourth int value
     * @param zahl5     Fith int value
     * @param zahl6     Sixth int value
     * @param zahl7     Seventh int value
     * @param i         loop int value
     * @param return    void
     */
    private static void druckeLottoscheinKästchen(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6, int zahl7, int i) {
        if (i == zahl1 || i == zahl2 || i == zahl3 || i == zahl4 || i == zahl5 || i == zahl6 || i == zahl7) {
            System.out.println("|X| " + i);
        } else {
            System.out.println("|_|");
        }
    }

    private static void testeUndDruckeNeueZeile(int i) {
        if (i % 7 == 0) {
            System.out.println("");
        }
    }
}
