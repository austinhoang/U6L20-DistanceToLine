

public class DistanceToLine
{
    /**
     * executes distance formula based on double values in test 
     * @param A, B, C, a, b
     * A, B, and C represent Ax+By+C=0 equation, a and b represent (x, y) coordinates respectively
     * @return the distance based on values given and distance formula
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
