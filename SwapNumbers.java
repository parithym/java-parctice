import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no a: ");
        int a = s.nextInt();

        System.out.println("Enter the no b: ");
        int b = s.nextInt();
        System.out.println("Before: a = "+ a +"  ,  "+ "b = "+ b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After: a = "+ a +" ,  "+ "b = "+ b);
    }
}




OUTPUT:
Enter the no a: 
5
Enter the no b: 
10
Before: a = 5  ,  b = 10
After: a = 10 ,  b = 5

=== Code Execution Successful ===
