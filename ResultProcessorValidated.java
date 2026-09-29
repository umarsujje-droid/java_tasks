import java.util.Scanner;

public class ResultProcessorValidated {

    
    private static double readValidMark(Scanner input, String prompt) {
        double mark = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                mark = input.nextDouble();
                if (mark >= 0.0 && mark <= 100.0) {
                    isValid = true;
                } else {
                    System.out.println("Mark must be between 0 and 100.");
                }
            } else {
                System.out.println("Please enter valid numeric marks only.");
                input.next();
            }
        }
        return mark;
    }

    public static void main(String[] args) {
        final double PROGRESSIVE_WEIGHT = 0.10;
        final double TEST_WEIGHT        = 0.10;
        final double PRACTICAL_WEIGHT   = 0.20;
        final double EXAM_WEIGHT        = 0.60;

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("----- ICT2104B RESULT PROCESSOR (VALIDATED) -----");
            System.out.println("1. Compute My Grade");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 1) {
                double progressive = readValidMark(input, "Progressive Assessment mark (/100): ");
                double tests       = readValidMark(input, "Tests mark (/100): ");
                double practical   = readValidMark(input, "Practical/Presentation mark (/100): ");
                double exam        = readValidMark(input, "Final Exam mark (/100): ");

                double totalMark = (progressive * PROGRESSIVE_WEIGHT)
                                 + (tests * TEST_WEIGHT)
                                 + (practical * PRACTICAL_WEIGHT)
                                 + (exam * EXAM_WEIGHT);

                char grade;
                if (totalMark >= 80)      grade = 'A';
                else if (totalMark >= 70) grade = 'B';
                else if (totalMark >= 60) grade = 'C';
                else if (totalMark >= 50) grade = 'D';
                else                      grade = 'F';

                System.out.println("Total: " + totalMark + "%   Grade: " + grade);
            } else if (choice != 0) {
                System.out.println("Invalid option, try again.");
            }

        } while (choice != 0);

        System.out.println("Goodbye!");
        input.close();
    }
}