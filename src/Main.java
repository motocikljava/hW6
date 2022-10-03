public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i ++) {
            System.out.println( i );
        }
        for (int u = 10; u >= 1; u --) {
            System.out.println( u );
        }
        for (int o = 0; o <= 17; o = o + 2) {
            System.out.println( o );
        }
        for (int p = 10; p >= -10; p --) {
            System.out.println( p );
        }
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println( y + " год является високосным");
        }
        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println( t );
        }
        for (int r = 1; r <= 512; r = r * 2) {
            System.out.println( r );
        }
        int m = 1;
        for (int e = 29000; e <= 29000 * 12; e = e + 29000) {
            System.out.println("Месяц " + m + ", сумма накоплений равна " + e + " рублей");
            m ++;
        }
        // вариант 2
        int cashMonth = 29000;
        int total = 0;
        int m1 = 1;
        for (int q = 1; q <= 12; q ++) {
            total = total + cashMonth;
            System.out.println("Месяц " + m1 + ", сумма накоплений равна " + total + " рублей");
            m1 ++;
        }

        int cashMonth1 = 29000;
        int tot = 0;
        int month = 1;
        for (int a = 1; a <= 12; a ++) {
            tot = tot + tot / 12;
            tot = tot + cashMonth1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + tot + " рублей");
            month ++;
        }
        System.out.println("сделал дз");

    }
}