
//Bug Explanation: The switch statement lacks break; statements at the end of each case, causing execution to fall through into subsequent cases and outputting both "Withdraw" and "Balance" when option is 2

//Corrected Code:
public class SnippetB {
    public static void main(String[] args) {
int option = 2;
switch (option) {
    case 1:
        System.out.println("Deposit");
        break;
    case 2:
        System.out.println("Withdraw");
        break;
    case 3:
        System.out.println("Balance");
        break;
    default:
        System.out.println("Invalid option");
        break;
}
    }
}