
public class SiomaiHouse{

    private int sflavor;
    private int pieces;

    public void qty(int q1){
      pieces=q1;
    }

   



public void setflavor(int f1){
  sflavor= f1;
}

public void setprice(int p1){
  price=p1;
}

    
  
     



     public void checkDISH(){
      if (sflavor == 1){
        System.out.println("PORK AND SHRIMP");

      }else if(sflavor == 2){

        System.out.println("JAPANESE");
        
      }else if (sflavor ==3){
        System.out.println("SHARKSFIN");

      } 
      
    }    


    public int add(){
     if (sflavor == 1){
       return  10 * pieces;
      

      }else if(sflavor == 2){

      
        return 15 * pieces;
      
      }else if (sflavor ==3){
      
        return 9 * pieces;
       
      } 
     return pieces;
      
    }    
  
  }

  
  