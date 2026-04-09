
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest ocean on Earth?",
            "What is the name of the first man to walk on the moon?",
            "What is the chemical symbol for gold?"
        };
        String[][] options = {
            {"1) Paris", "2) London", "3) Berlin", "4) Madrid"},
            {"1) Earth", "2) Mars", "3) Jupiter", "4) Venus"},
            {"1) Atlantic", "2) Indian", "3) Pacific", "4) Arctic"},
            {"1) Buzz Aldrin","2) Neil Armstrong","3) Michael Collins","4) Yuri Gagarin"},
            {"1) Ag","2) Hg","3) Fe","4) Au"}
        };
        int[] answers = {1, 2, 3, 2, 4};
         // correct option numbers

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Java Quiz Game!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is option " + answers[i]);
            }
        }
        System.out.println("\nQuiz Over! Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}
