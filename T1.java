import java.io.PrintStream;
import java.util.Scanner;

public class T1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    static String dv(int a){
        if (a == 0)
            return " ";
        return dv(a/2) + " "  + a % 2;
    }

    public static void main(String[] args) {
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            String w = dv(i);
            int q = 0;
            for (int j = 0; j < w.length(); j++){
                if (w.charAt(j) == '1')
                    q++;
            }
            out.print(q + " ");
        }
    }
}
