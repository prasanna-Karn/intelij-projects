import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        //4th project
        // Creating MAD LIBS GAME.

        String adjective1;
        String noun1 ;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective : ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun : ");
        noun1= scanner.nextLine();

        System.out.print("Enter an adjective : ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb : ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective : ");
        adjective3 = scanner.nextLine();

        System.out.println("Yesterday was full of " + adjective1 + ".");
        System.out.println("On our way to " + noun1 + ".");
        System.out.println("We ran into a minor " + adjective2 + " but, ");
        System.out.println("Due to some silly reason, We were " + verb1 + " for 5 hours ! ");
        System.out.println("It was a horrible " + adjective3 + " for all of us.");



        scanner.close();
    }

}
