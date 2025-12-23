import java.io.PrintStream;
import java.util.Scanner;

public class Task1 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    static String dv(int a){
        if (a == 0)
            return "";
        return dv(a/2) + ""  + a%2;
    }
    public static void main(String[] args) {
        int q = in.nextInt();
        for (int i = 1; i<=q; i++){
            String w = dv(i);
            int e = 0;
            for (int j = 0; j < w.length(); j++){
                if (w.charAt(j) == '1')
                    e++;
            }
            out.print(e + ", ");
        }
    }
}
