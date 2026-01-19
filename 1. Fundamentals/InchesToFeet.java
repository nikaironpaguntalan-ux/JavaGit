import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.print("Enter Value in Inches: ");
        double inches = c.nextFloat();
        
        System.out.println("Equivalent in Feet = " + inches / 12);
        c.close();
    }
}
