package src.minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        Faktorial fk = new Faktorial();
        System.out.println("Nilai Faktorial " + angka + " menggunakan BF: " + fk.faktorialBF(angka));
        System.out.println("Nilai Faktorial " + angka + " menggunakan DC: " + fk.faktorialDC(angka));
    }
}