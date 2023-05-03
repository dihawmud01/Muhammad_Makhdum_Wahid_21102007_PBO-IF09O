package com.makhdum.pbo.pertemuan2;

import java.util.Scanner;

public class Unguided2_M2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, programStudi;
        int umur;

        System.out.println("Form Pendaftaran Mahasiswa");
        System.out.println("==========================");

        // meminta input nama lengkap dari pengguna
        System.out.print("Masukkan Nama Lengkap: ");
        nama = input.nextLine();

        // memeriksa apakah nama sudah diisi atau belum
        if (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
            return;
        }

        // meminta input umur dari pengguna
        System.out.print("Masukkan Umur: ");
        umur = input.nextInt();

        // memeriksa apakah umur sudah memenuhi syarat atau belum
        if (umur < 17) {
            System.out.println("Maaf, Anda belum cukup umur untuk mendaftar!");
            return;
        }

        // tampilkan pilihan jurusan
        System.out.println("Pilih Jurusan :");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Teknik Komputer");

        // meminta input jurusan dari pengguna
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();

        // memeriksa pilihan jurusan dari pengguna
        switch (pilihan) {
            case 1:
                programStudi = "Teknik Informatika";
                break;
            case 2:
                programStudi = "Sistem Informasi";
                break;
            case 3:
                programStudi = "Teknik Komputer";
                break;
            default:
                System.out.println("Maaf, pilihan tidak tersedia!");
                return;
        }

        // tampilkan informasi pendaftaran mahasiswa
        System.out.println("==========================");
        System.out.println("Terima kasih telah mendaftar!");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + programStudi);
        System.out.println("==========================");
    }
}
