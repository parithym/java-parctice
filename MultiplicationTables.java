import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = s.nextInt();
        
        System.out.println("tables of "+ a);
        for(int i = 0;i <= 10;i++){
            System.out.println(a + "x" + i + "=" + (a*i) );
        }
    }
}



OUTPUT:
Enter the number: 
2

tables of 2
2x0=0
2x1=2
2x2=4
2x3=6
2x4=8
2x5=10
2x6=12
2x7=14
2x8=16
2x9=18
2x10=20

=== Code Execution Successful ===
