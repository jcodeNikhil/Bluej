/**
 * Write a description of class TrasMat here.
 * This Programm tranposes the given Matrix
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TrasMat
{
   static int arr[][]=new int[3][3];
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Numbers");
       for(int i=0;i<3;i++)
       {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
       }
       System.out.println("Given Matrix");
       for(int i=0;i<3;i++)
       {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
       }
       System.out.println("Transposed Matrix");
       for(int i=0;i<3;i++)
       {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
       }
   }
}