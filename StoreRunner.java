import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    // Closes the Scanner object
    input.close();


    Jewelry jewelry = new Jewelry();
    System.out.println(jewelry);

    System.out.println("");
    
    Ring ring = new Ring();
    System.out.println(ring);

    System.out.println("");

    Bracelet bracelet = new Bracelet();
    System.out.println(bracelet);

    System.out.println("");

    Necklace necklace = new Necklace();
    System.out.println(necklace);
    
  }
}
