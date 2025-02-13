/**
 * Lab2 Part1 the first challenge:
 * this is a program to show imprecision with large numbers to practice "+" 
 * operation and define variables. It works out values in decimal.
 * 
 * 
 *
 * @author   Qianyi Li
 * @version  1.2
 * @since   2/12/2025
 */
public class Lab2P1Imprecision
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
