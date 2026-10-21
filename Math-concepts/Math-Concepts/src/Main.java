import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

//        Case 1 :

//        double result;

//        System.out.println(Math.PI);  // value of PI
//        System.out.println(Math.E);   // value of Exponential

//        result= Math.pow(2,3);
//        result = Math.abs(-10);
//        result = Math.sqrt(25);
//        result = Math.round(2.9567); // rounds to the closest
//        result = Math.ceil(3.1);   // rounds to the highest hence ceil
//        result = Math.floor(5.9);  // rounds to the lowest hence floor
//        result = Math.max(100,2);  // gives the maximum number
//        result = Math.min(2,-3);   // gives the minimum number
//
//        System.out.print(result);


//        Case 2 :

        // Calculating the HYPOTENUS . FORMULA IS Math.sqrt(a² + b²)

//        double a;
//        double b;
//        double hypotenus;
//
//        System.out.print("Enter the value of a : ");
//        a=scanner.nextDouble();
//
//        System.out.print("Enter the value of b : ");
//        b=scanner.nextDouble();
//
//        hypotenus = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//
//        System.out.print("The HYPOTENUS is : " + hypotenus);

//        Case 3 :

        // Calculating  the circumference = 2 * Math.PI * radius
        // Calculating the area = Math.Pi * Math.pow( raduis , 2 );
        // Calculating the volume =  ( 4.0 / 3.0 ) * Math.Pi * Math.pow(radius ,  3 )


        double radius;
        double circumference;
        double area;
        double volume;


        System.out.print("Enter the Radius : ");
        radius = scanner.nextDouble();

        // circumference
        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is : " + circumference);
        System.out.printf("The circumference is :%.1f cm\n" , circumference);

        // area
        area= Math.PI * Math.pow(radius , 2);
        System.out.println("The area is : " + area);
        System.out.printf("The area is :%.1f cm²\n " , area);

                                                                    // crtl + cmd + space = ² ( power of 2 or 3 )
        //volume
        volume=( 4.0 / 3.0 ) * Math.PI * Math.pow ( radius , 3 );
        System.out.println("The volume is : " + volume);
        System.out.printf("The volume is :%.1f cm³\n " , volume);


        scanner.close();
    }
}
