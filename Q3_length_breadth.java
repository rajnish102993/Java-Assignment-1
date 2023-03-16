import java.util.Scanner;
public class Q3_length_breadth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Lenght");
        double lenght = sc.nextDouble();

        System.out.println("Enter the value of Breadth");
        double breadth = sc.nextDouble();

        double area = lenght*breadth;
        System.out.println("The Area of " +lenght+" and " +breadth+ " is "+ area);


    }
}
