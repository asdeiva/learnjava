/*
 * Sum of Array Except Self
Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.

Input Format
First line consists of an integer n which is the number of elements in array

Next n lines correspond to n elements of array

Output Format
Return the resultant array as asked in question.

Example 1
Input

4
4 3 2 10
Output

15 16 17 9
Explanation

After updation,

a[0]=15 i.e., 3+2+10

a[1]=16 i.e., 4+2+10

a[2]=17 i.e., 4+3+10

a[3]=9 i.e., 4+3+2
 */

 import java.util.*;
import java.lang.*;
import java.io.*;

public class SumofArrayExceptSelf
{
	public static void main (String[] args) throws java.lang.Exception
	{
            Scanner sc = new Scanner(System.in);
            int n,i,j, sum=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            int arr1[]=new int[n];
            for (i=0;i<n;i++) {
                arr[i]=sc.nextInt();
            }
            for(i=0;i<n;i++) {
                for(j=0;j<n;j++) {
                    sum=sum+arr[j];
                }
                int a = sum-arr[i];
                arr1[i]=a;
                sum=0;
            }
            // System.out.println(Arrays.toString(arr1));

            for (int k = 0; k < arr1.length; k++) {
                System.out.print(arr1[k]+" ");
            }
	}
}