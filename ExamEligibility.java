import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter attendance percentage (0-100): ");
        double attendance = input.nextDouble();

        if (attendance >= 75.0) {
            System.out.println("Eligible for exams.");
        } else if (attendance >= 60.0) {
            System.out.println("Eligible with a warning letter.");
        } else {
            System.out.println("Not eligible — see the Dean of Students.");
        }

        input.close();
    }
}