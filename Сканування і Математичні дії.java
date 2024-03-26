import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Практичне використання
        java.util.Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

        System.out.println("Додавання " + (num1 + num2) );
        System.out.println("Віднімання " + (num1 - num2) );
        System.out.println("Множення " + (num1 * num2) );
        System.out.println("Ділення " + (num1 / num2) );
        System.out.println("Остача " + (num1 % num2) );
    }
}