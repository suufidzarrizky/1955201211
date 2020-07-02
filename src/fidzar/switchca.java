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
public class switchca {
    public static void main(String[] args) {
         String nama = JOptionPane.showInputDialog(null, "siapa nama kamu!");
        String sekolah = JOptionPane.showInputDialog(null, "apa nama sekolahmu");
        String kelas = JOptionPane.showInputDialog(null, "kelas berapa kamu");
        String ruang = JOptionPane.showInputDialog(null, "apa ruang kelas kamu");
                
        switch (ruang) {
            case "unggulan":
                JOptionPane.showMessageDialog(null, "selamat" + nama + ", kamu masuk kelas unggulan");
                break;
            case "biasa": 
                JOptionPane.showMessageDialog(null, "selamat" + nama + ", kamu masuk kelas biasa");
                break;
            case "rendah":
                JOptionPane.showMessageDialog(null, "selamat" + nama + ",kamu masuk kelas rendah");
                break;
                default: JOptionPane.showMessageDialog(null, "maaf kelas yang kamu cari tadak ada yang cocok");
                }
    }
 
}
