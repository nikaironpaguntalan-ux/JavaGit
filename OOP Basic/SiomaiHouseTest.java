import java.util.Scanner;

public class SiomaiHouseTest{
    public static void main(String[] args){


    Scanner input= new Scanner(System.in);
    SiomaiHouse Siorat= new SiomaiHouse();
boolean vava= true;
    


    System.out.println("               Menu          ");
    System.out.println("");
    System.out.println("1.PORK AND SHRIMP    10 per piece");
    System.out.println("2. JAPANESE          15 per piece");
    System.out.println("3.SHARKSFIN          9 per piece");
    System.out.println();
  

    System.out.print("Enter Product: ");
    Siorat.setflavor(input.nextInt());
    System.out.print("How many pieces do you like?: ");
    Siorat.qty(input.nextInt());

    
    System.out.println("Your Order is: ");
    Siorat.checkDISH();

    System.out.println("Your Total Order is: " + Siorat.add());



    System.out.println("Do you want to add another order?(1yes/2no)");
   
    






    

    }
    }
