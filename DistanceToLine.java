
/**
 * Write a description of class DistanceToLine here.
 * 
 * @author (your names)
 * @version (a version number or a date)
 */
public class DistanceToLine
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param
     */
    public static double getDist(double A, double B, double C, double a, double b)
    {
     if (Math.pow(A, 2) + Math.pow(B, 2) == 0)
     {
      return 0.0; 
     }
     else 
     {
       double d = (Math.abs(A*a + B*b + C))/(Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));  
       return d;
     }   
    }
}
