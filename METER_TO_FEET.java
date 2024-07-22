import java.util.Scanner;

public class METER_TO_FEET {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number to convert from meters to feet
        System.out.println("Enter a Number to convert from meter to feet");
        int a = scan.nextInt();  // Read the integer input representing the length in meters

        // Convert meters to feet using the conversion factor 1 meter = 3.28084 feet
        double result = a * 3.28084;

        // Print the result of the conversion
        System.out.println("The conversion is: " + result);

        // Close the scanner to avoid resource leaks
        scan.close();
    }
}
