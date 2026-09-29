import java.util.Scanner;

public class BodaFareTable {
    public static void main(String[] args) {
        final double BASE_FARE = 2000.0;
        final double RATE_PER_KM = 500.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter maximum distance in km: ");
        int maxDistance = input.nextInt();

        System.out.println("\nBoda Fare Table");
        System.out.println("---------------");

        for (int distance = 1; distance <= maxDistance; distance++) {
            double fare = BASE_FARE + (RATE_PER_KM * distance);
            System.out.println(distance + " km  ->  UGX " + fare);
        }

        input.close();
    }
}
