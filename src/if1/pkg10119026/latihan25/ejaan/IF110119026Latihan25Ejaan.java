/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      ejaan nama
 */
public class IF110119026Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
        System.out.println("Ejaan untuk \""+nama+"\" adalah");
        int num = 1;
        
        for(char ejaan : nama.toCharArray()){
            System.out.println("Huruf ke-"+(num++)+" : "+ejaan);
        }
        
    }
    
}
