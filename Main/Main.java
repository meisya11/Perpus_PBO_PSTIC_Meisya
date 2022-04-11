//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meisya;

import java.util.Scanner;

public class Main {
    static String[] array = new String[100];
    static int i = 0;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = new String[5];
        Buku Book = new Buku("0", "0");
        Peminjam Pinjam = new Peminjam("0", "0", "0");
        new Scanner(System.in);

        String tambah;
        do {
            do {
                Book.setKb();
                Book.setJb();
                Pinjam.setNama();
                Pinjam.setNik();
                Pinjam.setTgl();
                String kode = Book.takeKb();
                String judul = Book.takeJb();
                String NIK = Pinjam.takeNik();
                String nama = Pinjam.takeNama();
                String TGL = Pinjam.takeTgl();
                dataBuku(kode, judul, NIK, nama, TGL);
                display();
                System.out.println();
                System.out.print("apakah anda ingin meminjam buku lagi (y/n) : ");
                tambah = scan.nextLine();
            } while(tambah.equals("y"));
        } while(tambah.equals("Y"));

    }

    static void dataBuku(String kode, String judul, String NIK, String nama, String TGL) {
        array[i] = kode + " --- " + judul + " --- " + nama + " --- " + NIK + " --- " + TGL;
        ++i;
    }

    static void display() {
        System.out.println();
        System.out.println("Kode --- Judul --- Nama --- NIK --- TGL");

        for(int j = 0; j < i; ++j) {
            System.out.println(array[j]);
        }

    }
}
