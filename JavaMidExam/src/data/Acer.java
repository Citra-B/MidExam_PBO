/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author citra
 */
public class Acer extends Laptop{
    String nama, brand, processor, os, storage;
    int core, ram, stok;
    double harga;

    public Acer(){

    }

    public Acer (String nama,String brand, String processor,
                int core, String os, int ram, String storage,
                int stok, double harga){
        super (nama, brand, processor,
                core, os, ram, storage, stok);
        this.nama = nama;
        this.brand = brand;
        this.processor = processor;
        this.core = core;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.stok = stok;
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString(){
        return "=====================================" + "\n" +
                "Nama Laptop \t\t: " + nama +"\n" +
                "Nama Brand \t\t: " + brand + "\n" +
                "Nama Processor \t\t: " + processor + "\n" +
                "Jumlah Core \t\t: " + core + "\n" +
                "Nama Sistem Operasi \t: " + os + "\n" +
                "Ukuran Ram \t\t: " + ram + "GB" + "\n" +
                "Tipe/jenis Storage \t: " + storage + "\n" +
                "Stok \t\t\t: " + stok + "\n" +
                "Harga per Satuan \t: Rp." + harga;
    }
}
