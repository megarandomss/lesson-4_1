// Цикл For
public class ForLoop {

    public static int multiplicity(int a) {
        return a % 4;
    }

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--)
            if (multiplicity(i) == 0) {
                System.out.println(i);
            }

    }
}

