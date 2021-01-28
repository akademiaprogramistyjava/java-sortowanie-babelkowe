public class BubbleSort4 {
    public static void main(String[] args) {
        int n = 20000;
        int[] d = new int[n];

        int min = 510;
        int max = 5123;
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * (max - min + 1));
        }

        System.out.println("------------1 -------------");
        long start = System.currentTimeMillis();
        // sortowanie
        int pmin = 0;
        int pmax = n - 2;
        int p;
        do {
            p = 0;
            for (int i = pmin; i <= pmax; i++) {
                if (d[i] <= d[i + 1]) {
                    continue;
                }
                int tmp = d[i];
                d[i] = d[i + 1];
                d[i + 1] = tmp;

                if (p == 0) {
                    pmin = i;
                }
                p = i;
            }
            if (pmin > 1) {
                pmin--;
            }
            pmax = p - 1;
        } while(p > 0);
        long stop = System.currentTimeMillis();

        System.out.println("Time: " + (stop - start));



    }
}
