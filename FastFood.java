public class FastFood {
  //Instance variables 
private String name;
private double cost;
  //Constructors
  //No argument constructor 
public FastFood() {
  this.name="noName";
  this.cost=5.0;
} 
  //Paramaterized constructor
    public FastFood(String name, double newCost){
  this.name=name;
  this.cost=cost;
    }
  //Accessor and Mutator methods

  public String getName(){
    return name;
  }
  public double getCost(){
    return cost;
  }
  public void setName(String newName){
    name=newName;
  }
  public void setCost (double cost){
    this.cost=cost;
  }
  //toString
public String toString(){
   String text= "Name:"+ name + "Cost" + cost;
  return text;
}
}
  //other methods 
