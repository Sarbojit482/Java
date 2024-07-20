import java.util.Scanner;
public class METER_TO_FEET {
    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a Number to convert from meter to feet");
        int a=scan.nextInt();

        double result = a*3.28084;
        System.out.println("The conversion is:-"+result);
    }
    
}
