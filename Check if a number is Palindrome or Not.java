class Solution {
    public boolean palindrome(int n) {
        int revNum = 0; 
        int dup = n;

        // Iterate through each digit of the number until it becomes 0
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld; // Build the reverse number by appending the last digit
            n = n / 10; // Remove the last digit from the original number
        }

        // Check if the original number is equal to its reverse
        return dup == revNum; // Return true if they are equal, otherwise false
    }
}

public class Main {
    public static void main(String[] args) {
        int number = 4554; // Example number
        Solution obj = new Solution();
        if (obj.palindrome(number)) { // Check if the number is a palindrome
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
