import java.util.Scanner;

public class SameOrNah {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the first word
        System.out.println("Enter the first word: ");
        String word1 = scanner.nextLine();

        // Prompt for and read the second word
        System.out.println("Enter the second word: ");
        String word2 = scanner.nextLine();

        // Check if the words are the same or different and print the result
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
