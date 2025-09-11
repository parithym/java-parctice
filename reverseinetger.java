import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long x = s.nextLong(); // input number
        long reverse = 0;

        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        // Check for overflow
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            System.out.println(0);
        } else {
            System.out.println((int)reverse);
        }
    }
}
OUTPUT:
Enter the number: 
12345678
87654321

=== Code Execution Successful ===
