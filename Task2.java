import java.io.PrintStream;
import java.util.Scanner;

public class Task2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        int c = 0;
        int k = 1;
        int ind1 = -1;
        int indo = 0;
        int indd = -1;
        int inddo = 0;
        int indz = 0;
        int m = 0;
        int[]a = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        for (int i = 1; i<n; i++){
            if (ind1 == -1) {
                ind1 = i - 1;
                indz = i - 1;
            }
            if (a[indz] < a[i]){
                if (k == 1) {
                    c++;
                    indz++;
                }
                else{
                    c++;
                    indz=i;
                }
            }
            else
                if (k == 1){
                    k = 0;
                    indd = i;
                    c++;
                }
                else{
                    if (m < c) {
                        m = c;
                        inddo = indd;
                        indo = ind1;
                    }
                    k = 1;
                    ind1 = -1;
                    i = indd;
                    indd=-1;
                    c = 0;
                }
        }
        if (m < c && m == 0) {
            m = c;
            inddo = indd;
            indo = ind1;
        }
        out.print((m+1) + " " + (indo + 1) + " " + (inddo+1));

    }
}
