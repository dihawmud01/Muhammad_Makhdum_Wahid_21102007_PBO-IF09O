package com.makhdum.pbo.pertemuan2;

import java.util.Scanner;

public class Unguided1_M2 {
    public static void main(String[] args){
        System.out.println("== Program Menampilkan Bilangan Genap ==");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas Bilangan : ");
        int batas = input.nextInt();

        for(int i=1; i<=batas; i++){
            if(i % 2 == 0){
                System.out.println("Bilangan Genap : " + i + " ");
            }
        }
    }

}
