import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+n-1)%n]=arr[i];
        }
          return temp;
    }
}