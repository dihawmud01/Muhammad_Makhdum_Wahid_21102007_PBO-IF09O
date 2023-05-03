package com.makhdum.pbo.pertemuan5;

public class Barang {
    //Atribute
    String nama;
    int harga;

    // Constructor
    public Barang(){}

    public Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    // Methods
    public void ShowInfo(){
        System.out.println("Nama Barang: " + this.nama);
        System.out.println("Harga Barang: " + this.harga);
        System.out.println();
    }
}
