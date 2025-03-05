import java.util.Scanner; 

public class PrintVowelsAndNonVowels {
  
  public static void main(String[] args) {
    int aCounter = 0;
    int eCounter = 0;
    int iCounter = 0;
    int oCounter = 0;
    int uCounter = 0;
    int spaceCounter = 0;
    int numVowels;
    int numConsonant;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a sentence: ");
    String sentence = scan.nextLine();

     for(int i = 0; i < sentence.length(); i++){
      if(sentence.charAt(i) == 'a'){
        aCounter++;
      }

      if(sentence.charAt(i) == 'e'){
          eCounter++;
      }

      if(sentence.charAt(i) == 'i'){
        iCounter++;
      }

      if(sentence.charAt(i) == 'o'){
        oCounter++;
      }

      if(sentence.charAt(i) == 'u'){
        uCounter ++;
      }
       
      if(sentence.charAt(i) == ' '){
        spaceCounter++;
      }
    }
    numVowels = aCounter + eCounter + iCounter + oCounter + uCounter;
    numConsonant = sentence.length() - numVowels - spaceCounter;
    System.out.println("The sentence you entered has " + numVowels + " lower case vowels and " + numConsonant + " of consonants ");
  }
}
