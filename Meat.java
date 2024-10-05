

public class Meat extends Supermarket {

  /*
   * Instance variables 
   */

  private String typeOfMeat;
  private boolean availability;
  private int amountAvailable;


  /*
   * Constructor 
   */
  
  public Meat() {
    typeOfMeat = "Unknown";
    availability = false;
    amountAvailable = 0;
  }
  /*
   * Parameterized Constructor
   */
  
  public Meat(String name, double cost, int inCart, String typeOfMeat, boolean availability, int amountAvailable) {
    super(name, cost, inCart); 
    this.typeOfMeat = typeOfMeat;
    this.availability = availability;
    this.amountAvailable = amountAvailable;
  }
  
  

  // gets the type of meat

  public String getTypeOfMeat() {
    return typeOfMeat;
  }

  // checks for if the item is available
  
  public boolean getAvailability() {
    return availability;
  }

  // gets the amount available
  public int getAmountAvailable() {
    return amountAvailable; 
  }

  /*
   * Mutator methods
   */

  public void setAvailability(boolean newAvailability) {
    availability = newAvailability;
  }

  public void setAmountAvailable(int newAmountAvailable) {
    amountAvailable = newAmountAvailable; 
  }

  public String toString() {
    return super.toString() + "\n Meat Products in Cart" + "\n -------------------------------------" + "\n Available?: " + availability + "\n Amount Available: " + amountAvailable +  "\n -------------------------------------" + "\n";
  }
}
