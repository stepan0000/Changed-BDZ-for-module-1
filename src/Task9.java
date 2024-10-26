import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int x = scanner.nextInt();

        int n = Integer.toString(x).length();

        System.out.println(n);

        int a[];
        a = new int[n];
        int y = x;
        for (int i=0;i<n;i++) {
            a[i] = y % 10;
            y = y / 10;
        };

        int b[];

        b = a.clone();
        int c[];

        c = new int[n];

        for (int i = 0; i<n;i++) {

        }

        System.out.println(Arrays.toString(b));

    }
}
