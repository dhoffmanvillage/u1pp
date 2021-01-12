package u1pp;

/**
 * @author YOUR NAME HERE
 * 
 * Unit 1 Programming Project
 */

import java.util.Scanner;

public class Main {
  
  private static final double PI = 0; //Replace the 0 with a correct value for pi in PART B. Delete this comment after
  private static Scanner sc = new Scanner(System.in); //Create a Scanner to do input and output

  public static void main(String[] args) {
    
    //Calls and executes the method partA that you write below
    partA();
    
    //Get a radius from the user and then send that information to the method partB that you write below
    double radius = processDouble("Enter a radius: ");
    partB(radius);
    
    //Get a bill total and tip percent from the user and then send that information to partC that you write below
    double billTotal = processDouble("Enter a bill total: ");
    double tipPercent = processDouble("Enter a tip percent: ");    
    partC(billTotal, tipPercent);
    
    sc.close();
  }

  /**
   * A method that creates and prints three variables. See README.md for more specifics
   */
  public static void partA() {
    //YOUR CODE FOR PART A HERE
  }

  /**
   * A method that, given a radius, prints the circumference and area of a circle and the volume of a sphere
   * @param radius the given radius to use in the calculations
   */
  public static void partB(double radius) {
    //YOUR CODE FOR PART B HERE
  }
  
  /**
   * A method that given the total of the bill and the percentage of the tip should print the amount of the tip
   * @param billTotal the total amount of the bill. Must be positive
   * @param tipPercent the percentge of the bill to leave as a tip. Must be between 0.0 - 100.0
   */
  public static void partC(double billTotal, double tipPercent) {
    //YOUR CODE FOR PART C HERE
  }

  /**
   * Helper method for data input. Prompts the user for input using the parameter and returns the input as a double
   * @param prompt the prompt to display to the console for the user input
   * @return the user's input as a double. Will throw an exception if the value input cannot be converted
   */
  private static double processDouble(String prompt) {
    String userInput = getInput(prompt);
    return Double.parseDouble(userInput);
  }

  /**
   * Helper method for processDouble. Actually does the prompting and getting a response from the user
   * @param prompt the prompt to display to the console for user input
   * @return the user's input as a String
   */
  private static String getInput(String prompt) {
    System.out.print(prompt);
    return sc.nextLine();
  }
}