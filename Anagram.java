/**
 * Write a description of class Anagram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Anagram
{
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        String str=obj.readLine();
        int l=str.length();
        System.out.println(l);
        System.out.println("");
        
        int F=1;//Factorial
        for(int j=l-1;j>=1;j--)
        {
             F*=j;
        }
        F=F*l;
        
        System.out.println("Number of combintions =" +F);
        System.out.println("");
         /*for(int i=1;i<=F;i++)
        {
             System.out.println(str);
        }*/
        //put str in array
        String Str[]=new String[l];
        for (int k=0;k<l;k++)
        {
            Str[k]=str.substring(k,k+1);
        }
        /*for (int m=0;m<l;m++)//to check array
        {
            System.out.println(Str[m]);
        }*/
        for(int n=0;n<F;n++)
        {
            for (int m=0;m<l;m++)
            {
                System.out.println(Str[m]);
            }
            System.out.println("");
        }
    }
}
