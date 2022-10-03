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
            System.out.println("Месяц " + m + " , сумма накоплений равна " + e + " рублей");
            m ++;
        }
        int mo = 1;
        var pr = 0.12;
        for (var w = 29000.0; w <= (29000.0 + 29000.0 * pr) * 12; w = w + 29000.0 + (29000.0 * pr)) {
            System.out.println("Месяц " + mo + " , сумма накоплений равна " + w + " рублей");
            mo ++;
        }

    }
}