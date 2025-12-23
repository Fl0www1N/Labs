import java.io.PrintStream;
import java.util.Scanner;
public class Task4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        int[]a = new int[n];
        int f = 0;
        for (int i = 0; i<n; i++)
            a[i] = in.nextInt();
        int k = in.nextInt();
        for (int i = 0; i <= n - 3; i++){
            for (int j = i+1; j <= k + i - 1; j++){
                for (int z = j+1; z <= k + i && z < n; z++){
                    if (a[i] - a[j] == a[j] - a[z]) {
                        out.println(a[i] + " " + a[j] + " " + a[z]);
                        f = 1;
                    }
                }
            }
        }
        if (f==0)
            out.print("NO");
    }
}
