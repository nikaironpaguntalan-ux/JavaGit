import java.util.Scanner;
public class AdderTest {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        Adder a= new Adder();

        System.out.print("Enter First Number:");
              
        a.setNum1(input.nextInt());



        System.out.print("Enter Second Number");
        a.setNum2(input.nextInt());
        System.out.println("SUM: "+ a.add());
        
    
        




        input.close();
    }
}