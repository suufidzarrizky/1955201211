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
public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("===================");
        System.out.println("    APOTEK UNU     ");
        System.out.println("===================");
        
        System.out.println("masukkan jumlah obat yang akan anda beli: ");
        int beli = input.nextInt();
        
        for (int i = 1; i<=beli; i++)
        {
            System.out.println("masukkan nama obat ke- "+i+" : ");
            String nama = input.next();
            System.out.println("masukkan harga obat ke- "+i+" : ");
            int harga = input.nextInt();
            System.out.println("masukkan jumlah obat ke- "+i+" : ");
            int jumlahb = input.nextInt();
            System.out.println("");
            
            System.out.println("======================");
            System.out.println("nama obat : "+nama);
            System.out.println("harga obat : "+harga);
            System.out.println("jumlah obat : "+jumlahb);
            System.out.println("======================");
            
            int total,totalb, diskon =0;
            total = harga * jumlahb;
            System.out.println("total obat = Rp."+total);
            if (total >=100000) {
                diskon=total/5;
            }else {diskon = 0;}
            
            System.out.println("diskon        = Rp."+diskon);
            totalb = total - diskon;
            System.out.println("total bayar   = Rp."+totalb);
            
            System.out.println("uang bayar    = Rp.");
            int bayar = input.nextInt();
            
            int kembali = bayar - totalb;
            System.out.println("uang kembali  = Rp."+kembali);
            System.out.println("=======================");
            System.out.println("");
    }
}
}