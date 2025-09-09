import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no: ");
    int a = s.nextInt();
    if(a % 2 == 0){
        System.out.print("Even");
    }else{
        System.out.print("odd");
    }
    
    }
}

OUTPUT:
Enter the no: 
4
Even
=== Code Execution Successful ===

