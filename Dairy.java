


public class Dairy extends Supermarket {

// Instance variables 
  
  private boolean inABottle;
  private boolean inACan;

  public Dairy() {
    inABottle = false;
    inACan = false;
  }

  public Dairy(String name, double cost, int inCart, boolean inABottle, boolean inACan) {
    super(name, cost, inCart);
    this.inABottle = inABottle;
    this.inACan = inACan; 
  }

  public boolean getInABottle() {
    return inABottle;
  }

  public boolean getInACan() {
    return inACan;
  }

  /*
   * Mutator methods
   */
  public void setInABottle(boolean newInABottle) {
    inABottle = newInABottle; 
  }

  public void setInACan(boolean newInACan) {
    inACan = newInACan; 
  }

  public String toString() {
    return super.toString() + "\n" + "\n Dairy Products in Cart" + "\n ------------------------------------- " + "\n Can it be found in a bottle?: " + inABottle + "\n Can it be found in a can?: " + inACan  +  "\n -------------------------------------" + "\n";
  }

  
}
