import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the operation they want to perform
        System.out.println("To perform :Addition(+), Multiplication(*), Subtraction(-), Division(/)");
        char opp = scan.next().charAt(0);  // Read the operation character input from the user

        // Prompt the user to enter the first number
        System.out.println("Enter First Number");
        int a = scan.nextInt();  // Read the first integer input

        // Prompt the user to enter the second number
        System.out.println("Enter Second Number");
        int b = scan.nextInt();  // Read the second integer input

        // Use a switch statement to perform the appropriate operation based on the user's input
        switch (opp) {
            case '+':
                // Perform addition
                System.out.println("Result: " + (a + b));
                break;
            case '*':
                // Perform multiplication
                System.out.println("Result: " + (a * b));
                break;
            case '-':
                // Perform subtraction
                System.out.println("Result: " + (a - b));
                break;
            case '/':
                // Perform division, but first check if the divisor is not zero
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default:
                // Handle invalid operator input
                System.out.println("Error: Invalid operator");
        }
    }
}
