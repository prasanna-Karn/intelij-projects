import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // calculate the area of rectangle

        double length = 0;
        double breath = 0;
        double area = 0;

        Scanner scanner =  new Scanner (System.in);

        System.out.print("Enter the length : ");
        length = scanner.nextDouble();

        System.out.print("Enter the breath : ");
        breath = scanner.nextDouble();

        area = length*breath;

        System.out.print("The area of the Rectangle is = " + area);




        scanner.close();
    }
}
