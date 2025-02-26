import java.util.Scanner;

public class Laba1Main2 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Введите количество чисел (n): ");
    int n = in.nextInt();

    if (n <= 0) {
        System.out.println("Количество чисел должно быть больше 0!");
        return;
    }

    // Ввод чисел
    int[] numbers = new int[n];
    System.out.println("Введите " + n + " целых чисел:");
    for (int i = 0; i < n; i++) {
        numbers[i] = in
                .nextInt();
    }

    //по возрастанию
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                // Меняем местами
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
    }

    // вывод чисел возрастание
    printResult("Числа в порядке возрастания: ", n, numbers);

    //по убыванию
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (numbers[j] < numbers[j + 1]) {
                // Меняем местами
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
            }
        }
    }

    // вывод чисел убывание
    printResult("Числа в порядке убывания: ", n, numbers);
    in.close();
}

    private static void printResult(String s, int n, int[] numbers) {
        System.out.print(s);
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}