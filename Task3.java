import java.io.PrintStream;
import java.util.Scanner;
public class Task3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        int e = 1;
        while (n % 2 == 0 || n % 5 == 0) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = n / 5;
        }
        if (n == 1)
            out.print(0);
        else {
            int w = 10 % n;
            while (w != 1) {
                w = w * 10 % n;
                e++;
            }
            out.print(e);
        }
    }
}
