/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.io.*;
/**
 *
 * @author LEGION Y540
 */
public class Latihan511Buff {
    public static void main(String[] args){
        BufferedReader In = new BufferedReader(new InputStreamReader( System.in) );
        
        String huruf, huruf1, huruf2, huruf3;
        
        try{
            System.out.print("Huruf 1 : ");
            huruf1 = In.readLine();
            System.out.print("Huruf 2 : ");
            huruf2 = In.readLine();
            System.out.print("Huruf 3 : ");
            huruf3 = In.readLine();
        
            huruf = huruf1 + " " + huruf2 + " " + huruf3;
            System.out.println(huruf);
        }catch( IOException e){
            
        }
    }
}
