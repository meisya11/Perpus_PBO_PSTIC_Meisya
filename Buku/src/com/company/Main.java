//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.meisya;

import java.util.Scanner;

class Buku {
    String kodeBuku;
    String judulBuku;
    Scanner in;

    Buku(String kb, String jb) {
        this.in = new Scanner(System.in);
        this.kodeBuku = kb;
        this.judulBuku = jb;
    }

    void setKb() {
        System.out.println("Masukkan Kode Buku = ");
        this.kodeBuku = this.in.nextLine();
    }

    void setJb() {
        System.out.println("Masukkan Judul buku = ");
        this.judulBuku = this.in.nextLine();
    }

    String takeKb() {
        return this.kodeBuku;
    }

    String takeJb() {
        return this.judulBuku;
    }
}
