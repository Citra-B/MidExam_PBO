/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import data.Acer;
import data.Asus;
import data.Hp;
import data.MSI;

/**
 *
 * @author citra
 */
public class Application {
    public static void main(String[] args) {
        var asus = new Asus();
        var msi = new MSI();
        var acer = new Acer();
        var hp = new Hp();
        
        System.out.println(asus);
        System.out.println(msi);
        System.out.println(acer);
        System.out.println(hp);       
    }
}
