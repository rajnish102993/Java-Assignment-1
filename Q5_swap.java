import java.util.Scanner;
public class Q5_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("After swapping, the first number is: " + num1);
        System.out.println("After swapping, the second number is: " + num2);
    }
    
}
