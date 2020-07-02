/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fidzar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class BUFFERED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
          
        String nama ;
        String agama ;
        String status ;
        double beratbadan ;
        int nomersepatu ;
  
        System.out.println("<><><><><><><>");
        
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("apa agama anda?");
        agama = br.readLine();
        
        System.out.println("apa status anda");
        status = br.readLine();
        
        System.out.println("berapa berat badan anda");
        beratbadan = Double.parseDouble(br.readLine());
        
        System.out.println("berapa nomer sepatu anda");
        nomersepatu = Integer.parseInt(br.readLine());
 
               
        System.out.println("===========");
        System.out.println("nama anda adalah :" + nama);
        System.out.println("agama anda adalah :" + agama);
        System.out.println("status anda adalah :" + status);
        System.out.println("berat badan anda adalah :" +beratbadan);
        System.out.println("nomer sepatu anda adalah ;" +nomersepatu);
       
       
    }
    
}
