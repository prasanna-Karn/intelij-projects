import java.util.Random ;

public class Main {


    public static void main ( String[] args) {

        Random random = new Random();

//        int num1, num2, num3 ;
//        double num4, num5, num6 ;
//
//        num1=random.nextInt(1,7);
//        num2=random.nextInt(12,70);
//        num3=random.nextInt(19,700);
//        num4=random.nextDouble(14.6,79.9);
//        num5=random.nextDouble(11.23,77.56 );
//        num6=random.nextDouble(10.12,71.3);
//
//
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);
//        System.out.println(num5);
//        System.out.println(num6);

        boolean side;

        side= random.nextBoolean();

        //System.out.println(side);

        if(side){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }



    }
}
