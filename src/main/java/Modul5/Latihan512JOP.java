/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import javax.swing.JOptionPane;
/**
 *
 * @author LEGION Y540
 */
public class Latihan512JOP {
    public static void main(String[] args){
    
        String huruf, huruf1, huruf2, huruf3;
        
        huruf1 = JOptionPane.showInputDialog("Huruf1 : ");
        huruf2 = JOptionPane.showInputDialog("Huruf2 : ");
        huruf3 = JOptionPane.showInputDialog("Huruf3 : ");
        
        huruf = huruf1 + " " + huruf2 + " " + huruf3;
        JOptionPane.showMessageDialog(null, huruf);
    }
}
