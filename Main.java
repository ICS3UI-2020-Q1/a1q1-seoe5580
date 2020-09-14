import java.util.Scanner;

/**
 * Converts temperture for users from celsius to fahrenheit
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creat a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // Asks what degree of temperture they would like to convert
    System.out.println("Please enter a temperature you would like to convert in degrees Celsius");

    // get input for user's temperature
    int cel = input.nextInt();

    // declears temperature for fahrenheit
    int fah = (cel*9)/5+32;

    // tells the user what temperture it is in fahrenheit
    System.out.println(cel + "°C" + " is the same as " + fah + "‎°F");

  }
}
