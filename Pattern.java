public class Pattern
{
    public static void main(String args[])
    {
        String word="XAVIER";
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
