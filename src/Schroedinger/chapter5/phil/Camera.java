package Schroedinger.chapter5.phil;

import java.util.Scanner;

public class Camera {
    // Schroedinger Page 182 - 190
    // Membervariables
    private int megaPixel;
    private double displaySize;
    private boolean isVisionStabilzed;
    private String brand;
    private int brennweiteMin;
    private int brennweiteMax;
    private int defaultMemorySize;
    private MemoryCard memoryCard;
    //private ArrayList <Picture> photoAlbum = new ArrayList <Picture>();
    private Objectiv objectiv;

    // Construktor
    //
    public Camera(int megaPixel, double displaySize, boolean isVisionStabilzed, String brand, int brennweiteMin
            , int brennweiteMax, int megabyte, Objectiv objectiv) {
        this.megaPixel = megaPixel;
        this.displaySize = displaySize;
        this.isVisionStabilzed = isVisionStabilzed;
        this.brand = brand;
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.defaultMemorySize = megabyte;
        this.memoryCard = new MemoryCard(megabyte);
        this.objectiv = objectiv;
    }

    // Methodes
    //
    public void objectivSelectionMenu(Objectiv objectiv){
        int selection = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n0 - Objektiv von Fotoapparat enfernen, 1 - Objektiv dem Fotoapparat hinzufügen");
        System.out.print("Deine Eingabe: ");
        selection = sc.nextInt();
        // Remove objectiv
        if (selection == 0){
            removeObjectiv();
        }
        else {
            addObjectiv(objectiv);
        }
    }

    private void removeObjectiv() {
        if (this.objectiv == null) {
            System.out.println("Objektiv wurde bereits der Kamera " + brand + " entfernt");
        } else {

            System.out.println("Objektiv " + objectiv.getName() + " wurde der Kamera " + brand + " entfernt");
            this.objectiv = null;
        }
    }

    private void addObjectiv(Objectiv objectiv){
        if (this.objectiv == null){
            this.objectiv = objectiv;
            System.out.println("Objektiv " + objectiv.getName() + " wurde dem Fotoapparat hinzugefügt");
        } else {
            System.out.println("Objektiv " + this.objectiv.getName() + " ist bereits am Fotoapparat");
            System.out.println("Bitte das Objektiv zuerst entfernen");
        }
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
        defaultMemorySize = memoryCard.getMegabyte();
        System.out.println("Eine neue Memory Card wurde der Kamera hinzugefügt");
        memoryCard.deletePicturesAndGetFullMemorySpace(defaultMemorySize);
    }

    public void deletePictures(){
        memoryCard.deletePicturesAndGetFullMemorySpace(defaultMemorySize);
    }

    public void makePhoto() {
        if (this.objectiv != null) {
            memoryCard.addPhotoToPhotoAlbum();
        } else {
            System.out.println("Kann kein Foto machen ohne Objektiv");
        }
    }
    public void printPhotoAlbum(){
        memoryCard.printPhotoAlbum();
    }
    public void printCamData(){
        System.out.println("\nminimale Brennweite: " + brennweiteMax);
        System.out.println("maximale Brennweite: " + brennweiteMax);
        System.out.println("bildstabilisiert: " + isVisionStabilzed);
        System.out.println("Displaygröße: " + displaySize);
        System.out.println("Marke: " + brand);
        System.out.println("Megapixel: " + megaPixel);
        System.out.println("Memory Frei: " + memoryCard.getMegabyte());
        System.out.println("Anzahl Bilder gespeichert: " + memoryCard.getPhotoAlbumPhotoCount());
        if (this.objectiv != null) {
            System.out.println("Objektiv: " + objectiv.getName() + "\n");
        }
        else {
            System.out.println("Objektiv: Noch kein Objektiv gewählt\n");
        }
    }
    // Getter
    //
    public String getBrand() {
        return brand;
    }

}
