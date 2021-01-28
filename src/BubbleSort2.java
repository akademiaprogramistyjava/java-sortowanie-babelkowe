public class BubbleSort2 {
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
        for (int j = n-2; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if(d[i] > d[i+1]){
                    int tmp = d[i];
                    d[i] = d[i+1];
                    d[i+1] = tmp;
                }
            }
        }
        long stop = System.currentTimeMillis();

        System.out.println("Time: "+(stop - start));

        // wyświetlenie
//        for (int number:d) {
//            System.out.println(number);
//        }
    }
}
