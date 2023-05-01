package com.makhdum.pbo.pertemuan3_tugas;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Nim : ");
        int nim = input.nextInt();
        Koperasi koperasi1 = new Koperasi();
        koperasi1.setNamaBarang("Buku Tulis");
        koperasi1.setHargaSatuan(5000);
        koperasi1.setJumlahBarang(10);
        Koperasi koperasi2 = new Koperasi();
        koperasi2.setNamaBarang("Pensil");
        koperasi2.setHargaSatuan(3000);
        koperasi2.setJumlahBarang(20);
        System.out.println();
        System.out.println("Nama Barang: " +
                koperasi1.getNamaBarang());
        System.out.println("Harga Satuan: " +
                koperasi1.getHargaSatuan());
        System.out.println("Jumlah Barang: " +
                koperasi1.getJumlahBarang());
        System.out.println("Total harga: "+
                (koperasi1.getHargaSatuan() * koperasi1.getJumlahBarang()));
        System.out.println();
        System.out.println("Nama Barang: " +
                koperasi2.getNamaBarang());
        System.out.println("Harga Satuan: " +
                koperasi2.getHargaSatuan());
        System.out.println("Jumlah Barang: " +
                koperasi2.getJumlahBarang());
        System.out.println("Total harga: "+
                (koperasi2.getHargaSatuan() * koperasi2.getJumlahBarang()));
        System.out.println();
        int totalHarga = (koperasi1.getHargaSatuan() *
                koperasi1.getJumlahBarang()) + (koperasi2.getHargaSatuan() *
                koperasi2.getJumlahBarang());
        System.out.println("Total Harga Semua Barang: " +
                totalHarga);
    }
}