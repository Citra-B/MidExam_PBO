/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;
/**
 *
 * @author citra
 */
public class LaptopApp {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String nama, brand, processor, os, storage;
        int core, ram, stok;
        double harga;

        System.out.println("Masukan Nama Laptop : ");
        nama = scanner.nextLine();

        System.out.println("Masukan Nama Brand : ");
        brand = scanner.nextLine();

        System.out.println("Masukan Nama Processor : ");
        processor = scanner.nextLine();

        System.out.println("Masukan Sistem Operasi : ");
        os = scanner.nextLine();

        System.out.println("======================================");
        System.out.println("| Storage Type | Storefront Position |");
        System.out.println("======================================");
        System.out.println("|   SSD M.2    |          Best       |");
        System.out.println("|  SSD SATA    |          Good       |");
        System.out.println("|    HDD       |         Middle      |");
        System.out.println("======================================");
        System.out.println("Masukan Jenis Storage : ");
        storage = scanner.nextLine();
        switch (storage){
            case "SSD M.2" -> System.out.println("Best");
            case "SSD SATA" -> System.out.println("Good");
            case "HDD" -> System.out.println("Middle");
        }

        System.out.println("Masukan Jumlah Core : ");
        core = scanner.nextInt();
        if (core < 0){
            System.out.println(core = 0);
            System.out.println("!! Tidak Boleh Negatif");
        }else{
            System.out.println();
        }

        System.out.println("Masukan Ukuran RAM dalam GB : ");
        ram = scanner.nextInt();
        if (ram < 0){
            System.out.println(ram = 0);
            System.out.println("!! Tidak Boleh Negatif");
        }else{
            System.out.println();
        }

        System.out.println("Masukan Jumlah stok  : ");
        stok = scanner.nextInt();
        if (stok < 0){
            System.out.println(stok = 0);
            System.out.println("!! Tidak Boleh Negatif");
        }else{
            System.out.println();
        }
        
        System.out.println("Masukkan Harga per Satuan (Rp.) : ");
        harga = scanner.nextDouble();

        var asus = new Asus(nama, brand, processor,
                core, os, ram, storage, stok, harga);
        System.out.println(asus);

    }
}
