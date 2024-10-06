public class Burger extends FastFood {

//intance variables
private String type;
  //Contructor 
public Burger () {
  this.type="FastFood1";
}
  public Burger (String name, String type, double cost){
  super (name, cost);
  this.type=type;
  }
  
  public void setType (String typeUpdate){
  type=typeUpdate;
  }
  //toString ()
  public String toString(){
    String text= "Food: Burger\n";
    text+=super.toString();
    text+=" Type:" + type;
    return text;
  }

} 