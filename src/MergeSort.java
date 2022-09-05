import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args)
    {
        int[] arr1 = new int[]{0,3,4,31,67,89,100};
        int[] arr2 = new int[]{4,6,30,35};
        mergeSort(arr1, arr2);
    }

    public static void mergeSort(int[] arr1, int[] arr2)
    {
        if(arr1 == null || arr2 == null || arr1.length <1 || arr2.length <1)
        {
            return;
        }

        int [] arr3 = new int[arr1.length + arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0;
        int j = 0;
        int k =0;

       for(k =0;k<arr3.length && i< len1 && j< len2;k++)
       {
           if(arr1[i]<=arr2[j]) {
               arr3[k] = arr1[i];
               i++;
           }
           else
           {
               arr3[k] = arr2[j];
               j++;
           }
       }
       k--;
       if(k < len1+len2 - 1)
       {
           if(i == len1)
           {
               for(int k1 = k+1;k1<arr3.length && j<len2 ;k1++)
               {
                   arr3[k1] = arr2[j];
                   j++;
               }
           }
           else if(j == len2)
           {
               for(int k1 = k+1;k1<arr3.length && i<len1 ;k1++)
               {
                   arr3[k1] = arr1[i];
                   i++;
               }
           }
       }

       System.out.println(Arrays.toString(arr3));
    }
}
