

public class Supermarket {

  /*
   * Instance variables
   */
  
  private String name;
  private double cost;
  private int inCart;

  /*
   * Constructor 
   */
  public Supermarket() {
    this("Unknown", 0.0, 0);
  }

  /*
   * Parameterized constructor 
   */
  
  public Supermarket(String name, double cost, int inCart) {
    this.name = name;
    this.cost = cost;
    this.inCart = inCart;
  }


  // gets name 
  public String getName() {
    return name;
  }

  // gets cost
  public double getCost() {
    return cost;
  }

  // gets amount 
  public int getInCart() {
    return inCart; 
  }

  /*
   * Mutator methods
   */

  public void setName(String newName) {
    name = newName;
  }

  public void setCost(double newCost) {
    cost = newCost;
  }

  public void setInCart(int newInCart) {
    inCart = newInCart; 
  }
  
  public String toString() {
    return name + "'s" + " Order: " + "\n Total Cost: " + "$" + cost + "\n How many items in cart?: " +   inCart +  "\n -------------------------------------" + "\n";
  }
  
}

