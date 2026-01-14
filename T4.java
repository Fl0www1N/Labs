import java.io.PrintStream;
import java.util.Scanner;
public class T4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt(); // Ввод длины последовательности
        int[]a = new int[n];
        int f = 0;
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt(); // Вносим последовательность в массив
        int k = in.nextInt(); // Вводим максимальное расстояние между двумя элементами тройки
        for (int i = 0; i <= n - 3; i++){ // Перебираем первые элементы
            for (int j = i + 1; j <= k + i - 1; j++){ // Перебираем вторые элементы
                for (int z = j+1; z <= k + i && z < n; z++){ // Перебираем третьи элементы
                    if (a[i] - a[j] == a[j] - a[z]) { // Проверяем на арифметическую прогрессию
                        out.println(a[i] + " " + a[j] + " " + a[z]); // Выводим значения тройки и меняем флаг
                        f = 1;
                    }
                }
            }
        }
        if (f == 0)
            out.print("NO"); // Если условие не выполнилось, выводим "NO"
    }
}
