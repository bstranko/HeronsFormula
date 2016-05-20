
/**
 * An interface to determine if length of three sides 
 * can be a ptriangle
 * returns the area of the triangle
 * 
 * @author (Dr. Moskol)
 * @version (20160327.01)
 */
public interface TriangleADT
{
  
    // determines if a, b and c can be a triangle
    // by using the triangle inequality
    // Any 2 sides of a triangle MUST satisfy the inequality
    // a + b  > c
    boolean isTriangle(    );
    
    
    double findArea(   );
    // returns the area of the triangle


}
