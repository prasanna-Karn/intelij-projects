import java.util.Scanner;

public class Main {
    public static void main (String [] args ){

        Scanner scanner = new Scanner (System.in);

        /*
        System.out.println("Enter your name : ");  // println creates a new line character
        String name=scanner.nextLine();            // here we have a declaration and assignment

        System.out.println("Enter your age : ");
        Integer age =  scanner.nextInt();

        System.out.println("What is your GPA : ");
        double grade = scanner.nextDouble();

        System.out.println("Give me your Roll Number : ");  // println gives 1 extra line ( in new line )
        int roll = scanner.nextInt();

        System.out.println("Are you a student ? ( true/false )");
        boolean role = scanner.nextBoolean();


        System.out.println("Your name is : " + name);
        System.out.println("wow you are " + age + " years old");
        System.out.println("and your GPA is " + grade);
        System.out.println("your roll number is " + roll );
        System.out.println("The fact that you are a student is " + role);

        if(role) {
            System.out.println("You are eligible for this course.");

        }
        else {
            System.out.println("Sorry, You are not eligible for this course.");
        }

         */

        // solving the newline buffer problem

        System.out.print("What's your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();  // we introduce this scanner.nextline without assigning it to something after entering any int or double.

        System.out.print("What is your favorite color : ");
        String color = scanner.nextLine();

        System.out.print("You are " + age + " years old. ");
        System.out.print("Your favorite color is " + color +".");


        scanner.close();
    }
}
