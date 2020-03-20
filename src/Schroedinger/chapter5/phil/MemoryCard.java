package Schroedinger.chapter5.phil;

import java.util.ArrayList;
import java.util.Scanner;

public class MemoryCard {
    // Membervariables
    //
    private int megabyte;
    private String photoName;
    private String brand = "SanDiskZ1";     // only anDiskZ1 compatibel to nikon and canon
    private ArrayList<Picture> photoAlbum = new ArrayList <Picture>();

    // Constructor
    //
    public MemoryCard(int megabyte) {
        this.megabyte = megabyte;
        this.brand = brand;
    }
    // Methodes
    //
    public void addPhotoToPhotoAlbum(){
        final int PHOTOSIZEMB = 10;
        Picture aPicture = null;

        if (this.megabyte >= PHOTOSIZEMB){
            System.out.println("KLICK, bitte dem Foto einen Namen geben: ");
            Scanner sc = new Scanner(System.in);
            String namePicture = sc.nextLine();
            this.photoAlbum.add(new Picture(namePicture));
            this.megabyte -= PHOTOSIZEMB;
        }
        else{
            System.out.println("Speicherplatz ist voll");
        }
    }

    public void printPhotoAlbum() {
        System.out.println("BLICK INS FOTOALBUM");
        if (!photoAlbum.isEmpty()) {
            for (int i = 0; i < photoAlbum.size(); i++) {
                System.out.println(photoAlbum.get(i).getPhotoName());
            }
        }
        else {
            System.out.println("LEER");
        }
    }

    public void printMemoryCardData(){
        getMemoryCardName();
        System.out.println("Speicher Frei: " + getMegabyte() + "MB");
        System.out.println("Anzahl Fotos: " + photoAlbum.size());
    }

    public void deletePicturesAndGetFullMemorySpace(int defaultMemorySize){
        photoAlbum.clear();
        setMegabyte(defaultMemorySize);
        System.out.println("Alle Bilder gelöscht");
        printMemoryCardData();
    }
    // Getter and Setter
    //
    public int getMegabyte() {
        return this.megabyte;
    }

    private void setMegabyte(int megabyte) {
        this.megabyte = megabyte;
    }

    private String getMemoryCardName(){
        return "Memory Card " + this.brand + ", - " + this.getMegabyte() + "MB";
    }

    public int getPhotoAlbumPhotoCount() {
        return this.photoAlbum.size();
    }
}
