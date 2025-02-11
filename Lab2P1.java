
/**
 * Program to show imprecision with large numbers
 *
 * @auther   Qianyi Li
 * @version  1.0
 * @since   2/6/2025
 */
public class Lab2P1
{
    public static void main(String [] args){
        double x=12345.6789e200;
        double y,z,zz;
        y=1/x;
        z=x*y;
        zz=1-z;
        
        System.out.println("the value of x is:"+ x);
        System.out.println("the value of y is:"+ y);
        System.out.println("the value of z(x*y) is:"+ z);
        System.out.println("the value of 1 - z is:"+ zz);
    }
}
