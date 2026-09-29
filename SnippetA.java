//Bug Explanation: The condition uses the assignment operator = instead of the comparison operator ==, which assigns true to hasPaidFees and causes the condition to always evaluate to true regardless of the initial value

//Corrected Code:
public class SnippetA {
    public static void main(String[] args) {
        boolean hasPaidFees = false;

        if (hasPaidFees) { // Equivalent to: if (hasPaidFees == true)
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}

