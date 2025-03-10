import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    final int MAX_BOTTLES = 100;
    int numBottles;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter number of verses of 100 Bottles of Beer on the Wall that you would like to print (1 to " + MAX_BOTTLES + "):");
    numBottles = scan.nextInt();

    while(numBottles <  1 || numBottles > MAX_BOTTLES){
      System.out.print("Invalid input. Please reenter: ");
      numBottles = scan.nextInt(); 
    }
  
    while (numBottles > 1){
      System.out.println(numBottles +" bottles of beer on the wall,");
      System.out.println(numBottles + " bottles of beer.");
      System.out.print("If one of those bottles should happen to fall,");
      System.out.println();

      numBottles = numBottles - 1;
    }
    
  System.out.println("1 bottle of beer on the wall,");
  System.out.println("1 bottle of beer on the wall.");
  System.out.println("If it should happen to fall");
  System.out.println("No more bottles of beer on the wall,");
  System.out.println("No more bottles of beer.");
  System.out.println("Go to the store and buy some more...");
  }
}
