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
public class IFELSE {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "siapa nama kamu!");
        String sekolah = JOptionPane.showInputDialog(null, "apa nama sekolahmu");
        String kelas = JOptionPane.showInputDialog(null, "kelas berapa kamu");
        String ruang = JOptionPane.showInputDialog(null, "apa ruang kelas kamu");
        int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "berapa nilai kamu"));
        
        if(nilai >= 85){
            JOptionPane.showMessageDialog(null,"selamat " + nama + ",kamu boleh masuk ruang kelas unggulan");
        }else{
            JOptionPane.showMessageDialog(null,"maaf" + nama + ",kamu tidak bisa masuk kelas unggulan!!!");
    }
}}
