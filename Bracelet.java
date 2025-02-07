public class Bracelet extends Jewelry {

  //the boolean isAdjustable tells if the bracelet is adjustable or not
  private boolean isAdjustable;

  //sets the default value of isAdjustable to false
  public Bracelet() {

    isAdjustable = false;
    
  }

  /*a parameterized constructor setting the layout for the bracelet object
  */
  public Bracelet(double price, int quantity, String material, boolean isAdjustable) {

    super(price, quantity, material);
    this.isAdjustable = isAdjustable;
    
  }

  //returns the boolean isAdjustable
  public boolean getIsAdjustable() {

    return isAdjustable;
    
  }

  //allows for the change of isAdjustable
  public void getIsAdjustable(boolean newIsAdjustable) {

    isAdjustable = newIsAdjustable;
    
  }

  public String toString() {

    return super.toString() + "\nIs it adjustable? " + isAdjustable;
    
  }
  
}
