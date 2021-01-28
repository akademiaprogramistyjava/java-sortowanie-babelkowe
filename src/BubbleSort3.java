public class BubbleSort3 {
    public static void main(String[] args) {
        int n = 100000;
        int[] d = new int[n];

        int min = 510;
        int max = 5123;
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * (max - min + 1));
        }

        System.out.println("------------1 -------------");
        long start = System.currentTimeMillis();
        // sortowanie
        for (int j = n - 2; j >= 0; j--) {
            int p = 1;
            for (int i = 0; i < j; i++) {
                if (d[i] > d[i + 1]) {
                    int tmp = d[i];
                    d[i] = d[i + 1];
                    d[i + 1] = tmp;
                    p = 0;
                }
            }
            if(p == 1){
                break;
            }
        }
        long stop = System.currentTimeMillis();

        System.out.println("Time: " + (stop - start));

    }
}
