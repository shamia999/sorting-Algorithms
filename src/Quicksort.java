import java.util.Arrays;

public class Quicksort
{
    public static void main(String[]args)
    {
        int []s={2,1,5,4};
        quick(s,0,s.length-1);
        print(s);
    }
    public static void quick(int[]s,int start,int end)
    {
        if(start<end)
        {
            int p=partition(s,start, end);
            quick(s,0,p-1);
            quick(s,p+1,end);
        }

    }
    public static int partition(int[]s,int start,int end)
    {
        int pivot=s[end];
        int pos=start;
        int temp;
        int r;
        for(int j=start;j<end;j++)
        {
            if (s[j] < pivot)
            {
                temp = s[pos];
                s[pos] = s[j];
                s[j] = temp;
                pos++;
            }


        }
            r=s[pos];
            s[pos]=s[end];
            s[end]=r;


     return pos;
    }

public static void print(int[]v)
{
    System.out.print(Arrays.toString(v));
}

}
