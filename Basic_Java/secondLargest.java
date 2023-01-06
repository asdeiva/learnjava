/*
 * 2nd Largest from array
Given an unsorted array of size N with distinct elements. Find the 2nd largest element from the array without sorting the array.

Input Format
The first line contains a single integer N.

The second line consists of N integers of the array.

Output Format
Print the second largest number in the new line.

Example 1
Input

6
3 2 1 5 6 4
Output

5
Explanation

5 is the second largest element of the array.

Example 2
Input

9
10 1 7 2 5 6 8 9 3
Output

9
Explanation

9 is the Second largest element in the array


 * 
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class secondLargest
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr [] = new int [n];

      for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(arr[n-2]);
	}
}