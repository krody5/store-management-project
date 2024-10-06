public class StoreRunner {
  public static void main (String[] args){

  FastFood FastFood1= new FastFood("Big", 5.0);
  System.out.println ("Original Name:" + FastFood1.getName());
  System.out.println ("Original Cost:" + FastFood1.getCost());

    FastFood1.setCost(4.0);
    FastFood1.setName ("Small");
    
    System.out.println ("New Name:" + FastFood1.getName());
    System.out.println ("New Cost:" + FastFood1.getCost());

   System.out.println (FastFood1.toString());


    Fries ff2= new Fries("Regular", 2.30,"Spread");
  System.out.println ("Original Sauce:" + ff2.getSauce());
  System.out.println ("Original Cost:" + ff2.getCost());

    ff2.setCost(2.0);
    ff2.setSauce("Ketchup");
    
    System.out.println ("New Sauce:" + ff2.getSauce());
    System.out.println ("New Cost:" + ff2.getCost());

   System.out.println (ff2.toString());


    
  }

    
  }
