/*
 * Sorted Insert Position
Given a sorted array A and a target value B, return the index if the target is found. If not, print the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Input Format
Input consists of three lines.

The first line contains integer n

The second line contains n space-separated integers, each a value of arr[i].

The third line contains integer k

Output Format
Print the index where the element is present. If it's not present, print the index it would be inserted into the sorted array.

Example 1
Input

4
1 3 5 6 
5
Output

2
Explanation

5 is found at index 2

Example 2
Input

4
1 3 5 6
2
Output

1
Explanation

2 will be inserted at index 1.
 */

 import java.util.*;
 import java.lang.*;
 import java.io.*;
 
 public class SortedInsertPosition
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         int b = sc.nextInt();
 
         System.out.println(sort(arr, b));
         sc.close();
     }
 
    static int sort(int[] arr, int B) {
 
         int n = arr.length;
         int low= 0, high = n-1;
         int ans = n;
         while (low <= high) {
             int mid = (low+high) / 2;
             if(arr[mid] >= B){
                 ans = mid;
                 high = mid-1;
             }else{
                 low=mid+1;
             }
         }
         return ans;
     }
 }