
/**
 * This program determines the area of multiple triangles. 
 * The user will be prompted to provide the number of triangles
 * he would like to test and the size of each side.
 * This program tests to see if three sides qualify for a triangle. 
 * If so, the program provides the area for the triangle.  
 * 
 * @author (Bridgette Stranko) 
 * @version (20160327.01)
 */

import java.util.Scanner;   // Needed for Scanner class
import java.util.InputMismatchException;

public class TriangleApp
{
    
    public static void main (String [] args)
    {
        int numOfRuns; 
        double firstSide = 0, secondSide= 0, thirdSide= 0, area = 0; 
        Scanner keyboard = new Scanner(System.in);
        
        numOfRuns = getNumOfTriangles(); 
        Triangle myTriangle;
        
        for (int i = 0; i < numOfRuns; i++)
        {
            try 
            {
                System.out.println("What size is the first side of your triangle?:" ); 
                firstSide = keyboard.nextDouble();
                
                // Consume the remaining new line character
                keyboard.nextLine();
            }
            catch (InputMismatchException e) 
            {
                // send error and exit
               System.out.println("\nThat was not a valid number.\n Goodbye!");
               System.exit(10); 
            }
            try 
            {
                System.out.println("What size is the second side of your triangle?:" ); 
                secondSide = keyboard.nextDouble();
                
                // Consume the remaining new line character
                keyboard.nextLine();
            }
            catch (InputMismatchException e) 
            {
                // send error and exit
               System.out.println("\nThat was not a valid number.\n Goodbye!");
               System.exit(10); 
            }
            try 
            {
                System.out.println("What size is the third side of your triangle?:" ); 
                thirdSide = keyboard.nextDouble();
                
                // Consume the remaining new line character
                keyboard.nextLine();
            }
            catch (InputMismatchException e) 
            {
                // send error and exit
               System.out.println("\nThat was not a valid number.\n Goodbye!");
               System.exit(10); 
            }
            myTriangle = new Triangle(firstSide, secondSide, thirdSide);
            
            if (myTriangle.isTriangle())
            {
                area = myTriangle.findArea();
                System.out.println("The area of your triangle is " + area);                 
            }
            else
            { 
                System.out.println("That is not a triangle"); 
            }
            
            System.out.println("Thanks for using my app. Goodbye!"); 
        }
    }
       
    public static int getNumOfTriangles()
        {
            int numOfTriangles = 0;
            try 
            { 
                 Scanner keyboard = new Scanner(System.in);
                //Make sure it is a number
                System.out.println("How many triangles would you like to input?"); 
                numOfTriangles = keyboard.nextInt();
                
                // Consume the remaining new line character
                keyboard.nextLine();
                
                //return the number to the main method.
                           }
            catch (InputMismatchException e) 
            {
                // send error and exit
               System.out.println("\nThat was not a valid number.\n Goodbye!"); 
               System.exit(10); 
            }
             return numOfTriangles; 
        }
   
       }
   
