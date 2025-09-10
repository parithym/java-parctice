import java.util.Scanner;
import java.util.*;
class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit: ");
        double fahrenheit = s.nextDouble();
        double celsius =(fahrenheit - 32) * 5 / 9;
        System.out.println("the temperature in celsius is : "+celsius);
    }
}

OUTPUT:
Enter the temperature in fahrenheit: 
123.789
the temperature in celsius is : 50.99388888888889

=== Code Execution Successful ===
