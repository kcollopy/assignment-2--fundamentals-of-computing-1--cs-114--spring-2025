public class CountFlips {
  public static void main(String[] args) {
    Coin myCoin;
    int count = 0;
    int headCount = 0;
    
    myCoin = new Coin();

      while (count < 100) {
        myCoin.flip();

          if (myCoin.isHeads()){

           headCount++; 
          } 

        count++;
      }
        System.out.println("The coin landed on heads " + headCount  + " times and on tails " + (100 - headCount) + " out of 100 coin flips");

  }
}
