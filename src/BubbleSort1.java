public class BubbleSort1 {
    public static void main(String[] args) {
        int[] d = {3, 44, -1, -4, 111, 23, 55, 1441, 25};

        int n = d.length;

        // wyświetlenie
        for (int number:d) {
            System.out.println(number);
        }

        System.out.println("-------------------------");
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

        // wyświetlenie
        for (int number:d) {
            System.out.println(number);
        }

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
