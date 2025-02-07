public class Necklace extends Jewelry {

  //the double length tells the length of the necklace
  private double length;

  //the default value for length is 12.5
  public Necklace() {

    length = 12.5;
    
  }

  /*a parameterized constructor to have the user input their own values for each variable
  */
  public Necklace(double price, int quantity, String material, double length) {

    super(price, quantity, material);
    this.length = length;
    
  }

  //returns the double length of the necklace
  public double getLength() {

    return length;
    
  }

  //allows the change of the length
  public void setLength(double newLength) {

    length = newLength;
    
  }

  public String toString() {

    return super.toString() + "\nLength: " + length;
    
  }
  
}
