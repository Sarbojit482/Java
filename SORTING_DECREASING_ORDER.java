import java.util.Scanner;

public class SORTING_DECREASING_ORDER {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter First number");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number");
        int num2 = scan.nextInt();
        System.out.println("Enter Third number");
        int num3 = scan.nextInt();

        // Create an array of the entered numbers
        int[] number = {num1, num2, num3};

        // Sort the array in decreasing order manually
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] < number[j]) {
                    // Swap number[i] and number[j]
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        // Display the numbers in decreasing order, each on a new line
        System.out.println("The numbers in decreasing order are:");
        for (int num : number) {
            System.out.println(num); // Print each number on a new line
        }

        // Close the scanner to prevent resource leak
        scan.close();
    }
}
