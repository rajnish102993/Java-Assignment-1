import java.util.Scanner;
public class Q4_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int cube = num*num*num;
        System.out.println("The Cube of "+ num + " is " + cube);

    }
    
}
