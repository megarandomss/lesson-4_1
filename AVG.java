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
        int amount = b - a + 1; // находим количество чисел в диапазоне
        int sum1 = 0;
        int sum2 = 0;
        int amountInteger = 0; // счетчик целых чисел

        for (int i = 0; i <= amount; i++) {
            if (a % 2 == 0) { // если число целое, увеличиваем счетчик r2 и считаем сумму целых чисел sum2
                amountInteger = amountInteger + 1;
                sum2 = sum2 + a;
            }
            sum1 = sum1 + a;
            a = a + 1;

        }

        double avg1 = (double) sum1 / amount;
        System.out.println("Среднее арифметическое = " + avg1);
        double avg2 = (double) sum2 / amountInteger;
        System.out.println("Среднее арифметическое четных чисел = " + avg2);

    }
}
