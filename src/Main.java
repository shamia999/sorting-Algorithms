import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner ss=new Scanner(System.in);
        int number=ss.nextInt();
        int[] array=new int[number];

        for(int i=0;i<number;i++)
        {
            array[i]=ss.nextInt();
        }
        int z=ss.nextInt();
        int o=binary(array,z);
        if(o==-1)
            System.out.println("number is not present in list unsuccessful search");
        else
            System.out.println(o);
    }
    public static int binary(int[]array,int z)
    {
        int start=0;
        int end=array.length-1;
        int mid=0;
        while(start<=end) {
            mid = (start + end) / 2;
            if (array[mid] == z)
                return mid;
            else if (array[mid] > z)
                end = mid - 1;
            else if (array[mid] < z)
                start = mid + 1;
        }
             return -1;

        }

    }


