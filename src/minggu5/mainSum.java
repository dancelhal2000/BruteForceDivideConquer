package src.minggu5;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan elemen: ");
        int elemen = sc.nextInt();

        Sum sum = new Sum(elemen);
        for (int i = 0; i < sum.keuntungan.length; i++) {
            System.out.print("Masukkan keuntungan elemen ke-" + (i + 1) + ": ");
            sum.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Hasil Total BRUTEFORCE: " + sum.totalBF());
        System.out.println("Hasil Total DIVIDECONQUER: " + sum.totalDC(sum.keuntungan, 0, sum.keuntungan.length - 1));
    }
}