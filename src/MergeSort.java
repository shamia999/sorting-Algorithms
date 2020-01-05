import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int array[] = new int[size];
        int i = 0;
        while (size-- > 0) {

            array[i] = s.nextInt();
            i++;
        }

        int[] samad = new int[array.length];
        samad = mergesort(array, 0, array.length - 1);


        System.out.print(Arrays.toString(samad));
    }

    public static int[] mergesort(int[] array, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(array, start, mid);
            mergesort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
        return array;
    }

    public static int[] merge(int[] array, int s, int mid, int e) {
        int l = s;
        int r = mid + 1;
        int k = 0;
        int[] temp = new int[array.length];
        while (l <= mid && r <= e)
        {
            if (array[l] <= array[r])
            {
                temp[k] = array[l];
                k++;
                l++;
            }
            else {
                temp[k] = array[r];
                k++;
                r++;
            }
        }
        while (l <= mid) {
            temp[k] = array[l];
            k++;
            l++;
        }

        while (r <= e) {
            temp[k] = array[r];
            r++;
            k++;
        }

        l = s;
        k = 0;
        while (l <= e)
        {
            array[l] = temp[k];
            k++;
            l++;
        }
        return array;




    }

    }




