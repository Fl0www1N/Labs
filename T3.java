import java.io.PrintStream;
import java.util.Scanner;
public class T3 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        out.println("Введите n - знаменатель дроби 1/n");
        int n = in.nextInt(); // Вводим знаменатель дроби
        int e = 1;
        while (n % 2 == 0 || n % 5 == 0) { // Избавляем знаменатель от множителей 2 и 5
            if (n % 2 == 0)
                n = n / 2;
            else
                n = n / 5;
        }
        if (n == 1) // Если знаменатель состоял только из чисел 2 и 5, то выводим 0, так как такой знаменатель не давал периодичности дроби
            out.print(0);
        else {
            int w = 10 % n; // Задаем первый остаток
            while (w != 1) {
                w = w * 10 % n; // Запоминаем следующий остаток, параллельно увеличивая степень 10
                e++;
            }
            out.print(e);
        }
    }
}
