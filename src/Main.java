
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a variable");
        a = scanner.nextLine();
        System.out.println("Enter the value of variable b");
        b = scanner.nextLine();

        System.out.println("The value you have entered for a is " + a);
        System.out.println("The value you have entered for b is " + b);
    }
}
