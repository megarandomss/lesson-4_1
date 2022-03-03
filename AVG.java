// Среднее арифметическое

import java.util.Scanner;

public class AVG {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int b = scanner2.nextInt();

        if (a > b) { //проверка, чтобы диапазон шел по возрастающей
            int x = a;
            a = b;
            b = x;
        }
        int count = b - a + 1; // находим количество чисел в диапазоне
        int sum = 0;
        int sumEvenNumbers = 0;
        int countEvenNumbers = 0; // счетчик целых чисел

        for (int i = 0; i <= count; i++) {
            if (a % 2 == 0) { // если число целое, увеличиваем счетчик r2 и считаем сумму целых чисел sum2
                countEvenNumbers = countEvenNumbers + 1;
                sumEvenNumbers = sumEvenNumbers + a;
            }
            sum = sum + a;
            a = a + 1;

        }

        double avg1 = (double) sum / count;
        System.out.println("Среднее арифметическое = " + avg1);
        double avg2 = (double) sumEvenNumbers / countEvenNumbers;
        System.out.println("Среднее арифметическое четных чисел = " + avg2);

    }
}
