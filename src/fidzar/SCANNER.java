/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fidzar;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SCANNER {
    public static void main(String[] args) {
        String nama,keyakinan;
        int nomersepatu;
        double beratbadan;
   
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("!!! data pribadi !!!");
        System.out.println(" nama ");
        
        nama = keyboard.nextLine();
        
        System.out.println(" agama ");
        String agama  = keyboard.nextLine();
        
        System.out.println(" status ");
        String status  = keyboard.nextLine();
        
        System.out.println(" nomer sepatu");
        int nosepatu = keyboard.nextInt();
        
        System.out.println("berat badan");
        double bbadan = keyboard.nextDouble();
        
         System.out.println("agama: " + agama);
         System.out.println("status: " + status);
         System.out.println("nomer sepatu: " + nosepatu);
         System.out.println("berat badan: " + bbadan); 
         System.out.println("agama: " + agama);

    }
}
