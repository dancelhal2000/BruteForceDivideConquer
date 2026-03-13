package src.minggu5.Latihan;

public class latihanmain {

    static int maxUTS_DC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmax = maxUTS_DC(arr, l, mid);
        int rmax = maxUTS_DC(arr, mid + 1, r);
        return Math.max(lmax, rmax);
    }

    static int minUTS_DC(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int lmin = minUTS_DC(arr, l, mid);
        int rmin = minUTS_DC(arr, mid + 1, r);
        return Math.min(lmin, rmin);
    }

    static double rataUAS_BF(Mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[8];

        mhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        mhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        System.out.println("=== HASIL PERHITUNGAN DATA MAHASISWA ===");

        int maxUTS = maxUTS_DC(mhs, 0, mhs.length - 1);
        System.out.println("a) Nilai UTS Tertinggi (Divide Conquer): " + maxUTS);

        int minUTS = minUTS_DC(mhs, 0, mhs.length - 1);
        System.out.println("b) Nilai UTS Terendah (Divide Conquer) : " + minUTS);

        double rataUAS = rataUAS_BF(mhs);
        System.out.println("c) Rata-rata Nilai UAS (Brute Force)   : " + rataUAS);
    }
}