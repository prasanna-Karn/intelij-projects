import java.util.Scanner;





public class Main {

    public static void main (String[] args) {

        // Shopping Cart


         Scanner scanner = new Scanner(System.in);

         String Item ;
         double Price;
         int Quantity;
         String Currency = "NRP ";
         double Total;


        System.out.println("What would you like to buy ? ");
        Item = scanner.nextLine();

        System.out.println("How much the price is ? ");
        Price = scanner.nextDouble();

        System.out.println("How many quantity you want ? ");
        Quantity = scanner.nextInt();


        Total= Price * Quantity;

        System.out.println("You want a "+ Item + ". The price is "+ Currency + Price + " And the quantity is " + Quantity);
        System.out.println("Your total is : " + Total);







         scanner.close();
    }
}
