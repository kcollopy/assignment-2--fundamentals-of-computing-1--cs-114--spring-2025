import java.util.Scanner; 

public class PrintVowelsAndNonVowels {
  
  public static void main(String[] args) {
    int aCounter = 0, eCounter = 0, iCounter = 0, oCounter = 0, uCounter = 0,
      letterCounter = 0, numVowels, numConsonant;
    String sentence;

    Scanner scan = new Scanner(System.in);

    System.out.println("Note: The letter 'y' is counted as a consonant in this program.");
    System.out.print("Enter a sentence: ");
    sentence = scan.nextLine();
    scan.close();

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

      if((sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') || 
        (sentence.charAt(i) >= 'B' && sentence.charAt(i) <= 'Z')){        //Counting all the letters excluding uppercase vowels

       if(!(sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || 
        sentence.charAt(i) == 'O' || sentence.charAt(i) == 'U')){
        letterCounter++;
       }
      }
    }
    numVowels = aCounter + eCounter + iCounter + oCounter + uCounter;  
    numConsonant = letterCounter - numVowels;

    System.out.println("The sentence you entered has " + numVowels + " lowercase vowels and " + numConsonant + " consonants.");
  }
}
