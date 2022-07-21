
import java.util.Scanner;

public class PlusMinusRecursive {
    static int minus(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            return minus(x - 5);
        }
    }

    static int plus(int x, int y) {
        if (x > y) {
            return x;
        } else {
            System.out.print(x + " ");
            return plus(x + 5, y);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Number : ");
            int number = input.nextInt();

            plus(minus(number), number);

            if (number == 0) {
                break;
            }

            System.out.println("\nTo exit, touch 0.");
        }
    }
}