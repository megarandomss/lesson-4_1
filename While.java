import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//     int i = 0;
//     int sum = 0;
//
//     while (i <= 9){
//         sum = sum + i;
//         System.out.println("Текущее значение sum = " + sum);
//         ++i;
//     }
/////////////////////////////////////////////////////////////////////////////////////
        Scanner stringFromConsole = new Scanner(System.in);
        String name;
        do {

            System.out.println("Введите Ваше имя: ");
            name = stringFromConsole.nextLine();
        }
        while (name.length() == 0);
        System.out.println("Привет, " + name + "!");
    }
}
