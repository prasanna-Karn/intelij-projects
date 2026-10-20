import java.util.Scanner;


public class Main {

    public static void main ( String[] args) {

        // If Else Statements

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean check;


        System.out.print("Please Enter your name : ");
        name=scanner.nextLine();

        System.out.print("Please Enter your age : ");
        age=scanner.nextInt();

        System.out.print("Are you a Student ? (true/false) ");
        check=scanner.nextBoolean();

        //Case1
        if(name.isEmpty()){
            System.out.println("Why didn't you Enter your name ? Anyway ! ");
        }
        else{
            System.out.println("Nice to meet you "+name);
        }

        //Case2
        if(age>18) {
            System.out.println("You are an adult. ");
        }
        else {
            System.out.println("Sorry, You are not an adult.");
        }

        //Case3
        if(check){
            System.out.print("Wow, you are a Student. ");
        }
        else{
            System.out.print("Opps, you are not a Student. ");
        }

        scanner.close();
    }
}
