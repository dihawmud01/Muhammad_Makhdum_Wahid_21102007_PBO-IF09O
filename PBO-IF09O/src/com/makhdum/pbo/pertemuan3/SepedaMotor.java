package com.makhdum.pbo.pertemuan3;

public class SepedaMotor {
    //Atribut
    public String merek;
    public String tipe;
    public int harga;

    //Constructor
    public SepedaMotor() {}

    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;

        System.out.println("Makhdum Ganteng");
    }

    //Method
    public void showInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " +  harga);
        System.out.println();
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
