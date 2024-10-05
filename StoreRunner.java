import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    Supermarket s = new Supermarket("Unknown", 0.00, 0);
    Meat m = new Meat("Unknown", 0.00, 0, "Unknown", false, 0);
    Dairy d = new Dairy("Unknown", 0.00, 0, false, false);
       
    // Accesses the Supermarket class.
  
    System.out.println("What is your name for the visit?: " + "\n");
    String newName = input.nextLine();
    System.out.println("\n");
    
    
    System.out.println("What is the total cost of your items?: " + "\n");
    double newCost = input.nextDouble();
    System.out.println("\n");
    
    
    System.out.println("How many items are in your cart?: " + "\n");
    int newInCart = input.nextInt();
    System.out.println("\n");
    

    s.setName(newName);
    s.setCost(newCost);
    s.setInCart(newInCart);

    System.out.println(s); 

    // Accesses the Meat class
    System.out.println("Currently asking about Meat products... ");
    System.out.println("\n");
    
    System.out.println("Is your selected choice of meat available?: " + "\n");
    boolean newAvailability = input.nextBoolean();
    System.out.println("\n");
    
    
    System.out.println("If so, how much is available?: " + "\n");
    int newAmountAvailable = input.nextInt(); 
    System.out.println("\n");

    if((newAvailability == false) && (newAmountAvailable == 0)) {
      System.out.println("There are no Meat products. Restocking soon.");
      System.out.println("\n");
    } else {
      System.out.println("\n");
    }
    
    m.setName(newName);
    m.setCost(newCost); 
    m.setInCart(newInCart);
    
    m.setAvailability(newAvailability);
    m.setAmountAvailable(newAmountAvailable); 

    System.out.println(m);

    // Accesses the Dairy class
    
    System.out.println("Currently asking about Dairy products... ");
    System.out.println("\n");
    
    System.out.println("Is your item found in a bottle?: " + "\n");
    boolean newInABottle = input.nextBoolean();
    System.out.println("\n");

    

    System.out.println("Is your item found in a can?: " + "\n");
    boolean newInACan = input.nextBoolean(); 
    System.out.println("\n");
    
    // If statement to put a custome message in the console if the dairy product isn't in a bottle or can. 
    if((newInABottle == false)  &&  (newInACan == false)) {
      System.out.println("There are currently no dairy products in your cart.");
      System.out.println("\n");
    } else {
      System.out.println("\n");
    }
      
    
    d.setName(newName);
    d.setCost(newCost); 
    d.setInCart(newInCart);
    
    d.setInABottle(newInABottle);
    d.setInACan(newInACan); 

    System.out.println(d);
    
    
    // Closes the Scanner object
    input.close();
    
  }
}
