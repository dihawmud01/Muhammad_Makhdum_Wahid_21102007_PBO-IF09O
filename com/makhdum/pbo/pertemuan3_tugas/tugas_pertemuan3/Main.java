package com.makhdum.pbo.pertemuan3_tugas.tugas_pertemuan3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Nim : ");
        int nim = input.nextInt();
        Buku buku1 = new Buku(1, "Pemrograman Berbasis Objek dengan Java", "Indrajani", 2007, 70000);
                Buku buku2 = new Buku(2, "Dasar Pemrograman Java", "Abdul Kadir", 2004, 30000);
                buku1.tampilDetailBuku();
        buku2.tampilDetailBuku();
        System.out.print("Masukkan nomor buku yang ingin dibeli: ");
        int nomorBuku = input.nextInt();
        System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
        int jumlahBuku = input.nextInt();
        int totalHarga = beli_buku(nomorBuku, jumlahBuku);
        System.out.println("Total Harga\t: " + totalHarga);
        System.out.print("Masukkan jumlah bayar\t: ");
        int jumlahBayar = input.nextInt();
        bayar_buku(nomorBuku, jumlahBuku, totalHarga, jumlahBayar);
    }
    public static int beli_buku(int nomorBuku, int jumlahBuku) {
        int hargaBuku = 0;
        switch(nomorBuku) {
            case 1:
                hargaBuku = 70000;
                break;
            case 2:
                hargaBuku = 30000;
                break;
            default:
                System.out.println("Nomor buku yang Anda masukkan tidak valid!");
        }
        return hargaBuku * jumlahBuku;
    }
    public static void bayar_buku(int nomorBuku, int jumlahBuku,
                                  int totalHarga, int jumlahBayar) {
        int kembalian = jumlahBayar - totalHarga;
        System.out.println("\n== Rincian pembelian buku ==\n");
        System.out.println("No. Buku\t\t: " + nomorBuku);
        if(nomorBuku == 1) {
            System.out.println("Judul Buku\t\t: Pemrograman Berbasis Objek dengan Java");
                    System.out.println("Pengarang\t\t: Indrajani");
            System.out.println("Tahun Terbit\t: 2007");
            System.out.println("Harga\t\t\t: 70000");
        } else if(nomorBuku == 2) {
            System.out.println("Judul Buku\t\t: Dasar Pemrograman Java");
                    System.out.println("Pengarang\t\t: Abdul Kadir");
            System.out.println("Tahun Terbit\t: 2004");
            System.out.println("Harga\t\t\t: 30000");
        }
        System.out.println("\nJumlah Buku\t\t: " + jumlahBuku);
        System.out.println("Total Harga\t\t: " + totalHarga);
        System.out.println("\n== Rincian pembayaran ==\n");
        System.out.println("Jumlah Bayar\t: " + jumlahBayar);
        System.out.println("Kembalian\t\t: " + kembalian);
    }
}