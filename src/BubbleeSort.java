import java. util.Scanner;
public class BubbleeSort
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int[]array=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++)
        {
            array[i]=s.nextInt();
        }
        bubble(array);

    }
    public static void bubble(int[]array)
    {
        int n=array.length;
        for(int i=0;i<n;i++) //passes
        {
            for(int j=1;j<n-i;j++)
            {
                if(array[j-1]<array[j])
                {
                    int t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;

                }
            }
        }
        print(array);
    }
    public static void print(int[]array)
    {
        int i=array.length;
        while(i-- >0)
        {System.out.print(array[i] + " ");

        }
    }


}
