public class Main {

    public static void main(String[] args) {

        int x = 3, y = 0;
        int[] z = new int[5];


        while (true) {
            y = fibo(x);

            if (y >= 100 && y < 1000) {
                if (z[0] == 0) {
                    System.out.println("Ponad 100 par w miesiącu " + x);
                    z[0] = x;
                }
            } else if (y >= 1000 && y < 10000) {
                if (z[1] == 0) {
                    System.out.println("Ponad 1000 par w miesiącu " + x);
                    z[1] = x;
                }
            } else if (y >= 10000 && y < 100000) {
                if (z[2] == 0) {
                    System.out.println("Ponad 10000 par w miesiącu " + x);
                    z[2] = x;
                }
            } else if (y >= 100000 && y < 1000000) {
                if (z[3] == 0) {
                    System.out.println("Ponad 100000 par w miesiącu " + x);
                    z[3] = x;
                }
            } else if (y >= 1000000) {
                if (z[4] == 0) {
                    System.out.println("Ponad 1000000 par w miesiącu " + x);
                    z[4] = x;
                    break;
                }
            }
            x++;
        }


    }

    static int fibo(int n) {


        int[] tab = new int[n + 1];
        tab[1] = 1;
        tab[2] = 1;

        for (int i = 3; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[tab.length - 1];
    }
}