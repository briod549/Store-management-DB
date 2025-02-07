public class Ring extends Jewelry {

  //The variable size tells the size of the ring
  private int size;

  //sets the default value of a ring
  public Ring() {

    size = 5;
    
  }

  /*a parameterized constructor that allows the main method
  to give their own values when instantiating
  */
  public Ring(double price, int quantity, String material, int size) {

    super(price, quantity, material);
    this.size = size;
    
  }

  //returns the size of the ring
  public int getSize() {

    return size;
    
  }

  //main method can change the size of the ring
  public void setSize(int newSize) {

    size = newSize;
    
  }

  public String toString() {

    return super.toString() + "\nSize: " + size;
    
  }
  
}
