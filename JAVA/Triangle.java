
/**
 * Determines whether the length of the sides qualify to make a triangle 
 * and returns the area of the triangle using heoron's formula. 
 * 
 * @author (Bridgette Stranko) 
 * @version (20160327.01)
 */
public class Triangle implements TriangleADT
{
    private double sideOne, sideTwo, sideThree; 
    
  /** Constructor */

  /**
   *  Create a triangle with all three sides provided
   */
    public Triangle ( double one, double two, double three) 
    {
        sideOne = one; 
        sideTwo = two; 
        sideThree = three; 
    }
  /**
   * determines if the three sides can be a triangle
   * by using the triangle inequality
   * @return whether or not it qualifies as a triangle
   */ 
    public boolean isTriangle()
    {
        double twoSides = 0; 
        boolean qualifies = false;
        twoSides = sideOne + sideTwo; 
        
        if (twoSides > sideThree)
        { 
            qualifies = true; 
        } 
        
        else 
        { 
            qualifies = false; 
        } 
        
        return qualifies; 
    }
    
   /**
   * Uses Heron's formula to determine
   * the area of the triangle
   * @return the area of the triangle
   */    
    public double findArea()
    {
        double sp, triArea; 
        
        sp = (sideOne + sideTwo + sideThree) / 2;
        
        triArea = Math.sqrt(sp*(sp-sideOne)*(sp-sideTwo)*(sp-sideThree)); 
        
        return triArea;         
       
    }
}