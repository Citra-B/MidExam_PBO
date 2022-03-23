/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author citra
 */
public class Laptop {
    private String nama, brand, processor, os, storage;
    private int core, ram, stok;
    
    public Laptop(){
    }
    
    public Laptop(String nama,String brand, String processor,
            int core, String os, int ram, String storage, int stok){
        this.nama = nama;
        this.brand = brand;
        this.processor = processor;
        this.core = core;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.stok = stok;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    @Override
    public String toString(){
        return "=====================================" + "\n" +
                "Nama Laptop : " + nama +"\n" +
                "Nama Brand : " + brand + "\n" +
                "Nama Processor : " + processor + "\n" +
                "Jumlah Core Pada Processor: " + core + "\n" +
                "Nama Sistem Operasi : " + os + "\n" +
                "Ukuran Ram : " + ram + "GB" + "\n" +
                "Jenis Storage : " + storage + "\n" +
                "Stok : " + stok;
    }
}    
