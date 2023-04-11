/*
 * Description: Prompts the user to enter the side of a hexagon and displays its area
 */

import java.util.Scanner;

public class Hexagon {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Prompt the user to enter the side of a hexagon
      System.out.print("Enter the side of a hexagon: ");
      double side = input.nextDouble();

      // Compute the area of the hexagon
      double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;

      // Display the result
      System.out.println("The area of the hexagon is " + area);
   }
}
