public class BubbleSort2 {
    public static void main(String[] args) {
        int[] d = {3, 44, -1, -4, 111, 23, 55, 1441, 25};

        int n = d.length;

        // wyświetlenie
        for (int number:d) {
            System.out.println(number);
        }

        System.out.println("-------------------------");
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

        // wyświetlenie
        for (int number:d) {
            System.out.println(number);
        }
    }
}
