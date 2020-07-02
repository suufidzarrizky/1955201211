/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fidzar;

/**
 *
 * @author HP
 */
public class dowhilE {
    public static void main(String[] args) {
        int n = 1   ;
        String Password = "";
        System.out.println("mulai");
        System.out.println("masukan user");
        System.out.println("masukkan password");
   
        String password;
        password = "benar";
        System.out.println("apakah password yang anda masukkan benar?");
        if("benar".equals(password)) {
    }
        else {
            System.out.println("salah");
        }
        int i = 1;
        do {
            System.out.println("masukkan password lagi -" + i);
            i++;
        }
        while (i <= 4);{
        System.out.println("sukses");
    }
    }}
