package Schroedinger.chapter5.phil;

import java.util.Scanner;

public class PhotoShooting {
    // Membervariables
    //
    private static Objectiv objectiv1 = new Objectiv("Vision-101");
    private static Objectiv objectiv2 = new Objectiv("SuperVision2020");

    private static Camera nikon = new Camera(50, 40.5, true, "Nikon",
            30, 100, 100, null);
    private static Camera canon = new Camera(100, 60.2, false, "Canon",
            50, 120,50, null);
    private static Camera selectedCamera = nikon;

    // This class executes code from Camera class
    //
    public static void main(String[] args) {
        selectionMenu();
    }

    private static void selectionMenu() {
        int selection;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nKamera Auswahlmenü: 1 - Fotomachen, 2 - Alle Fotos löschen, " +
                    "3 - Neue Speicherkarte hinzufügen, 4 - Kamera Datenblatt,\n\t\t\t\t\t5 - Fotoalbum ansehen, " +
                    "6 - Kamera wechsel, 7 - Objektiv hinzufügen/enfernen, 0 - Ende");
            System.out.print("Deine Eingabe: ");
            selection = sc.nextInt();
            callMethod(selection);
        } while (selection != 0);
    }

    private static void callMethod(int selection) {
        switch (selection) {
            case 0:
                System.out.println("Ende");
                break;
            case 1:
                selectedCamera.makePhoto();
                break;
            case 2:
                selectedCamera.deletePictures();
                break;
            case 3:
                selectedCamera.setMemoryCard(new MemoryCard(100));
                break;
            case 4:
                selectedCamera.printCamData();
                break;
            case 5:
                selectedCamera.printPhotoAlbum();
                break;
            case 6:
                setSelectedCamera();
                break;
            case 7:
                selectedCamera.objectivSelectionMenu(objectiv1);
                break;
            default:
                System.err.println("Ungültige Eingabe");
        }
    }

    private static void setSelectedCamera() {
        if (selectedCamera == nikon) {
            selectedCamera = canon;
        } else {
            selectedCamera = nikon;
        }
        System.out.println(selectedCamera.getBrand() + " ausgewählt.");
    }
}
