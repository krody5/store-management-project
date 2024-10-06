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
  /*
   * Sets name to the specified name,
   * cost to the specified cost
   */
    public FastFood(String name, double newCost){
  this.name=name;
  this.cost=cost;
    }
  //Accessor and Mutator methods
/* 
  * Returns the value assigned to name
  */
  public String getName(){
    return name;
  }
  /* 
  * Returns the value assigned to cost
  */
  public double getCost(){
    return cost;
  }
  /* 
  * Allows the name to be able to set to a new name
  */
  public void setName(String newName){
    name=newName;
  }
  /* 
  * Allows the cost to be able to set to a new cost
  */
  public void setCost (double cost){
    this.cost=cost;
  }
  //toString
public String toString(){
   String text= "Name:"+ name + "Cost" + cost;
  return text;
}
}
