import java.util.Scanner; // Importing the Scanner class for user input

public class CommandLineArguments {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the command line
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their input
        System.out.print("Enter your input: ");
        
        // Read the input from the user and store it in a String variable
        String input = scanner.nextLine();
        
        // Print the input back to the user
        System.out.println("You entered: " + input);
    }
}
