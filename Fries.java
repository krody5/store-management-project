public class Fries extends FastFood {
//intance variables
private String sauce;
  //Contructor 
public Fries () {
  this.sauce="Spread";
}
  public Fries (String name, double cost, String sauce){
  super (name, cost);
  this.sauce=sauce;
  }
  //Accessor and Mutator methods
   public String getSauce(){
  return sauce;
}

  public void setSauce(String newSauce){
  this.sauce = newSauce;
  }
 //toString ()
  public String toString(){
    String text= "Food: Fries\n";
    text+=super.toString();
    text+=" Sauce:" + sauce;
    return text;
  }

  //other method 
} 