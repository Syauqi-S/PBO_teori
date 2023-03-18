/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

import javax.swing.JOptionPane; // mengimport class JOptionPane dari package
/**
 *
 * @author LEGION Y540
 */
public class Syauqi { // Latihan modul 3.6.1
    public static void main(String[] args){
    
       String nama; //mendeklarasi variabel nama dengan tipe data String
       
       nama = JOptionPane.showInputDialog("Masukkan nama anda"); // untuk mengisi variabel nama dengan input user
       
       JOptionPane.showMessageDialog(null, "Welcome to Java Programming " + nama); // untuk menampilkan statement dan nama yang telah diinputkan 
    }
}
