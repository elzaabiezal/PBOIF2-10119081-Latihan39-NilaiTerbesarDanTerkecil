/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan39.nilaiterbesardanterkeci;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Nilai Terbesar dan Terkecil
 */
public class Nilai {
    Scanner scanner = new Scanner(System.in);
    int[]nilai = new int [10];
    int n;
    int max;
    int min;
    
    public int inputBanyakNilai() {
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        n = scanner.nextInt();
        return n;
    }
    
    public void inputNilai() {
        for (int i = 1; i <=n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + "=");
            nilai[i] = scanner.nextInt();
        }
    }
    
    public void outputNilai() {
        for (int i = 1; i <=n; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }
    
    public int max () {
        max=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    
    public int min () {
        min=nilai[1];
        for (int i = 1; i <=n; i++) {
            if (nilai[i] < min) {
                min=nilai[i];
            }
        }
        return min;
    }
}
