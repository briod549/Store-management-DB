public class Jewelry {

  /* these instance variables make up the attributes
  of the Jewelry object.
  */
  private double price;
  private int quantity;
  private String material;

  /* This functtion creates default
  values for each instance variable.
  */
  public Jewelry() {

    this(13.99, 1, "silver");
    
  }

  /* This parameterized constructor gives the main function the ability
  to create their own variable values for the object.
  */
  public Jewelry(double price, int quantity, String material) {

    this.price = price;
    this.quantity = quantity;
    this.material = material;
    
  }

  /* This method returns the current price of the jewelry
  */
  public double getPrice() {

    return price;
    
  }

  /*This method returns the quantity of jewelry
  */
  public int getQuantity() {

    return quantity;
    
  }

  /*This method returns the material of the jewelry
  */
  public String getMaterial() {

    return material;
    
  }

  /*The main method can call this method to change the price of the jewelry
  */
  public void setPrice(double newPrice) {

    price = newPrice;
    
  }

  /*The main method can call this method to change the quantity value
  */
  public void setQuantity(int newQuantity) {

    quantity = newQuantity;
    
  }

  /*This method allows the main method to change the material string
  */
  public void setMaterial(String newMaterial) {

    material = newMaterial;
    
  }

  /*The toString method prints all variable values
  */
  public String toString() {

    return "Price: " + price + "\nQuantity: " + quantity + "\nMaterial: " + material;
    
  }
  
}
