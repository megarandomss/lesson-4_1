import java.util.Scanner;
public class main {

    public static void main(String[] args) {
//
//      int productPrice = 100;
//      int productNumber = 10;
//
//      System.out.println("Сумма = " + productPrice * productNumber + " руб.");
//
//      String myString = "    My automation string       ";
//
//      System.out.println("Строка без пробелов: " + myString.trim());
//      int stringLength = myString.trim().length();
//
//      System.out.println("Длина строки: " + stringLength);

//      int productPrice = 100;
//      int productPrice2 = 200;
//      System.out.println("price 2 > price 1: " + (productPrice2 > productPrice));


//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Введите Ваше имя: ");
//      String stringFromConsole = scanner.nextLine();
//      System.out.println("Доброе утро! " + stringFromConsole + "!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = scanner.nextLine();
        if (name.length() > 0)
        {
            System.out.println("Привет, " + name + "!");
        }
        else {
            System.out.println("Привет, неизвестный!");
        }
}}


