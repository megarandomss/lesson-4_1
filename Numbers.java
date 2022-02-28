// Цифры числа
import java.util.Scanner;

public class Numbers {

//    public static int amount(int a){ // узнать количество цифр в числе
//        int count = 0; //
//        for (int i = 0; a > 0; i++) {
//            count++;
//            a = a / 10;
//        }
//        return count;
//    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = number.nextInt();
        int sum1 = 0; // сумма цифр
        int sum2 = 0; // сумма четных цифр
        int b = 0;
        int x = 0;

        while (a != 0) {
            b = a % 10;
            sum1 = sum1 + b;
            if (b % 2 == 0) {
                sum2 = sum2 + b;
            }
            if (b > x) {
                x = b;
            }
            a = a / 10;

        }
        System.out.println("Сумма цифр = " + sum1);
        System.out.println("Сумма четных цифр = " + sum2);
        System.out.println("Максимальная цифра = " + x);
    }
}
