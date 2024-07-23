import java.util.Scanner;

public class TestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your test score (0-100): ");
        int score = scanner.nextInt();

        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid score";
        }

        if (grade.equals("Invalid score")) {
            System.out.println("Invalid score entered. Please enter a number between 0 and 100.");
        } else {
            System.out.println("Your grade is " + grade + ".");
        }
    }
}
