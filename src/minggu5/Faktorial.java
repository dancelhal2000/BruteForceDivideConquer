package src.minggu5;

class Faktorial {
    int faktorialBF(int n) {
        int faktorialBF = 1;
        for (int i = 1; i <= n; i++) {
            faktorialBF *= i;
        }
        return faktorialBF;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}
