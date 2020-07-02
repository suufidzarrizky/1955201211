/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fidzar;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JOPTIONPANE {
    public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog("siapa nama anda?");
        String agama = JOptionPane.showInputDialog("apa agama anda?");
        String status = JOptionPane.showInputDialog("apa status anda?");
        String nomersepatu= JOptionPane.showInputDialog("berapa nomer sepatuanda?");
        String beratbadan = JOptionPane.showInputDialog("berapa berat badan anda?");
        
        int jumlah = Integer.parseInt(beratbadan);
        int data = 1200;
        double total = jumlah*data;
         
        System.out.println("siapa nama anda :" + tanya);
        System.out.println("apa agama anda :" + agama);
        System.out.println("apa status anda :" + status);
        System.out.println("berpa nomer sepatu anda :" + nomersepatu);
        System.out.println("berapa berat badan anda :" + beratbadan);
    }
}
