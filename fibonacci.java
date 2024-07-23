public class fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
