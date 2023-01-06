/*
 * Divisible Sum Pairs
Given an array of integers, arr, and a positive integer k, determine the number of (i,j) pairs in the array where i<j and arr[i] + arr[j] is divisible by k.

Input Format
Input consists of two lines.

The first line contains 2 space-separated integers, n (size of array) and k.

The second line contains n space-separated integers, each a value of arr[i].

Output Format
Print the number of pairs a[i] + a[j] divisble by k, where i<j.

Example 1
Input

6 3          
1 3 2 6 1 2
Output

5
Explanation

Here are the 5 valid pairs when k = 3:

(0,2) = arr[0]+arr[2] = 1 + 2 = 3

(0,5) = arr[0]+arr[5] = 1+ 2 = 3

(1,3) = arr[1]+arr[3] = 3 + 6 = 9

(2,4) = arr[2]+arr[4] = 2 + 1 = 3

(4,5) = arr[4]+arr[5] = 1 + 2 = 3

Example 2
Input

4 5          
1 3 2 6 
Output

1
Explanation

Here is the 1 valid pairs when k = 5:

(1,2) = arr[1]+arr[2] = 2 + 2 = 5


 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class DivisibleSumPairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();
                int arr[]=new int[n];
                for (int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                int ans=divisibleSumPairs(n,k,arr);
                System.out.print(ans);
       
}
        public static int divisibleSumPairs(int n, int k, int[] ar) {
    int count = 0;
    for(int i=0; i<ar.length; i++){
      for(int j=i+1; j<ar.length; j++){
            if(((ar[i]+ar[j])%k)==0){
                if(i < j)
                   count++;
            }
        }
    }
    return count;
}
}
        