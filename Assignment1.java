// Import libraries here
import java.util.Scanner;
// Arlo Ashton
public class Assignment1 {
  public static void main(String[] args) {
    String userString;
    float userTemperature;

    //PRINTS INITIALS
    System.out.println(
     "\n      A             A       "
    +"\n     A A           A A      "
    +"\n    A   A         A   A     "
    +"\n   AAAAAAA       AAAAAAA    "
    +"\n  AA     AA     AA     AA   "
    +"\n AAA     AAA   AAA     AAA  "
    );
    //GETS USER VALUES FOR STRING AND TEMPERATURE
Scanner stringScan = new Scanner(System.in);
System.out.println("Enter a 5 Character Long String:");
userString = stringScan.nextLine();

Scanner temperatureScan = new Scanner(System.in);
System.out.println("Enter a temperature value in farenheit:");
userTemperature = temperatureScan.nextFloat();

float celcius = (userTemperature - 32) * 5/9;
System.out.println(celcius);
  }
}
