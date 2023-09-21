import java.util.Scanner;
import java.util.Random;
// Arlo Ashton
public class Assignment1 {
  public static void main(String[] args) {
    String userString, letter1, letter2, letter3, processedString;
    float userTemperature;
    int intRandom;
    //PRINTS INITIALS
    System.out.println(
     "\n      A             A     "
    +"\n     A A           A A    "
    +"\n    A   A         A   A   "
    +"\n   AAAAAAA       AAAAAAA  "
    +"\n  AA     AA     AA     AA "
    +"\n AA       AA   AA       AA"
    );
//GETS USER VALUE FOR STRING
Scanner stringScan = new Scanner(System.in);
System.out.println("Enter a 5 Character Long String:");

userString = stringScan.nextLine();
int length = userString.length();

// CHECKS IF STRING IS 5 CHARACTERS
if (length > 5){
  System.out.println("String LONGER than 5 characters...");
  System.exit(0);
}
else if (length <= 4){
  System.out.println("String SHORTER than 5 characters...");
  System.exit(0);
}

letter1 = userString.substring(1, 2);
letter2 = userString.substring(2, 3);
letter3 = userString.substring(3, 4);
processedString = letter3 + letter2 + letter1;

Scanner temperatureScan = new Scanner(System.in);
System.out.println("Enter a temperature value in farenheit:");
userTemperature = temperatureScan.nextFloat();

float celcius = (userTemperature - 32) * 5/9;
System.out.println(celcius);

//RANDOM NUMBER SECTION
Random rand = new Random();
intRandom = rand.nextInt(16384);

//Prints Final Step :D
System.out.println(celcius + processedString + intRandom);
  }
}
