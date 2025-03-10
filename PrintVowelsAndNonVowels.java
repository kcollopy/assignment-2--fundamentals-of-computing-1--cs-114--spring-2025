import java.util.Scanner; 

public class PrintVowelsAndNonVowels {
  
  public static void main(String[] args) {
    int aCounter = 0;
    int eCounter = 0;
    int iCounter = 0;
    int oCounter = 0;
    int uCounter = 0;
    int letterCounter = 0;
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
        uCounter++;
      }

      if((sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') || (sentence.charAt(i) >= 'B' && sentence.charAt(i) <= 'Z')){ //Counting all the letters excluding uppercase vowels
       if(!(sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U')){
        letterCounter++;
       }
      }
    }
    numVowels = aCounter + eCounter + iCounter + oCounter + uCounter;  
    numConsonant = letterCounter - numVowels;

    System.out.println("The sentence you entered has " + numVowels + " lowercase vowels and " + numConsonant + " consonants ");
  }
}
