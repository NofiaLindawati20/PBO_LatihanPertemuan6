/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysederhana;

/**
 *
 * @author
 * NAMA     : NOFIA LINDAWATI
 * KELAS    : PBO6
 * NIM      : 23215034
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Array Sederhana
 */
public class ArraySederhana {
public static void main(String[] args) {
    String[] nama = new String[5];
    nama[0] = "Thanos";
    nama[1] = "Blackpanther";
    nama[2] = "Thor";
    nama[3] = "AntMan";
    nama[4] = "Hulk";

    for (int i = 0; i < 5; i++) {
        System.out.println("Nama pada indeks " + i + ": " + nama[i]);
    }
}
}