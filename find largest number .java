import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int a = s.nextInt();
        System.out.println("Enter the no: ");
        int b = s.nextInt();
        System.out.println("Enter the no: ");
        int c = s.nextInt();
        int largest;
        if(a >= b && a >=c){
            largest = a;
        }else if(b >= a && b >= c){
            largest = b;
        }else{
            largest = c;
        }
        System.out.println("the largest no out of three is "+largest);
    }
    
    }
OUTPUT:
Enter the no: 
5
Enter the no: 
3
Enter the no: 
7
the largest no out of three is 7

=== Code Execution Successful ===
