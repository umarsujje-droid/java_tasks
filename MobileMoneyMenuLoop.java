import java.util.Scanner;

public class MobileMoneyMenuLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("----- MOBILE MONEY MENU -----");
            System.out.println("1. Send Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Buy Airtime");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter recipient and amount...");
                    break;
                case 2:
                    System.out.println("Your balance is UGX 125,000.");
                    break;
                case 3:
                    System.out.println("Enter phone number for airtime...");
                    break;
                case 0:
                    System.out.println("Thank you for using Mobile Money.");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        } while (choice != 0);

        input.close();
    }
}
