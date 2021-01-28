public class BubbleSort1 {
    public static void main(String[] args) {

        int n = 20000;
        int[] d = new int[n];

        int min = 510;
        int max = 5123;
        for (int i = 0; i < d.length; i++) {
            d[i] = (int)(Math.random() * (max - min + 1));
        }

        // wyświetlenie
//        for (int number:d) {
//            System.out.println(number);
//        }

        System.out.println("-------------------------");
        long start = System.currentTimeMillis();
        // sortowanie
        for (int j = 0; j < n-1; j++){
            for(int i = 0; i < n-1; i++){
                if(d[i] > d[i+1]){
                    int tmp = d[i];
                    d[i] = d[i+1];
                    d[i+1] = tmp;
                }
            }
        }
        long stop = System.currentTimeMillis();

        System.out.println("Time: "+(stop - start));

//        // wyświetlenie
//        for (int number:d) {
//            System.out.println(number);
//        }

    }
}

/*

tab = 4, 2, -1
tmp = tab[0];     // 4
tab[0] = tab[1];
tab = 2, 2, -1
tab[1] = tmp;
tab = 2, 4, -1

 */
