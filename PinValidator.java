import java.util.Scanner;

public class PinValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter your 4-digit PIN (1000-9999): ");

            if (input.hasNextInt()) {
                pin = input.nextInt();
                if (pin >= 1000 && pin <= 9999) {
                    isValid = true;
                } else {
                    System.out.println("PIN must be a 4-digit number between 1000 and 9999.");
                }
            } else {
                System.out.println("Please enter whole numbers only.");
                input.next(); // Discard the invalid non-integer token
            }
        }

        System.out.println("PIN accepted.");
        input.close();
    }
}
