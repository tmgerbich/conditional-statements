import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the first number
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt for and read the second number
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Compare the numbers and print the appropriate message
        if (num1 == num2) {
            System.out.println("Same: Numbers are the same");
        } else if (num1 > num2) {
            System.out.println("Number one is larger than number two: The first number was larger than the second");
        } else {
            System.out.println("Number two is larger than number one: The second number was larger than the first");
        }
    }
}
