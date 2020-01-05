import java.util.*;
public class Insertion
{
public static void main(String[]args)
{
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    insertion(a);
}
public static void insertion(int[]a)
{
        for (int i =1; i <a.length; i++)
        {
            for (int j =i; j > 0; j--)
            {
                if (a[j] < a[j - 1])
                {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                    //System.out.println("naila");
                }

            }
        }


    print(a);
    }
    public static void print(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }

}



