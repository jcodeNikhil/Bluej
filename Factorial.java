/**
 * Write a description of class Factorial here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(int F)
    {
        int Out=1;
        for(int i=F-1;i>=1;i--)
        {
            Out*=i;
        }
        Out=Out*F;
        System.out.println(Out);
    }
}
