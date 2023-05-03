package com.makhdum.pbo.pertemuan5;

public class Main {
    public static void main(String[] args) {

        Barang[] keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie", 2000),
                new Barang("Mie Sedaap", 2000),
                new Barang("Beras", 12000),
                new Barang("Gula", 15000),
        };

    // Melihat Panjang Arrays
    System.out.println(
            "Banyak barang di Etalase : "
            +etalase.length);

    etalase[0].ShowInfo();

        System.out.println("Daftar barang di etalase: ");

//        int i=1;
//        for (Barang barang : etalase){
//            System.out.println("Barang ke - " + i);
//            barang.ShowInfo();
//            i++;
//        }
        for (int j=0; j<etalase.length; j++) {
            System.out.println("Barang ke - " + (j+1));
            etalase[j].ShowInfo();
        }

        //Memasukkan barang ke keranjang
        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang : ");
        keranjang[0].ShowInfo();
        }
    }
