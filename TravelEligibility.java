import java.util.Scanner;
public class TravelEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to travel internationally. ");
        } else if (age >= 18) {
                System.out.println("Get passport to travel.");
        if (age < 18) {
            System.out.println("Eligible to travel with guardian.");
            }
        } else {
                System.out.println("Not eligible to travel.");
                scanner.close();
                return;
        }
    }
}