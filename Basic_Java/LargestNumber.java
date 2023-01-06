/*
 * Largest Number
Given a list of non negative integers, arrange them such that they form the largest number.

Input Format
First line contains integer N

Second line contains N integers arr[i]

Output Format
Print the largest number that can be formed

Example 1
Input

5
3 30 4 53 9
Output

9534330
Explanation

This is the largest number possible

Example 2
Input

5
3 30 34 5 9
Output

9534330
Explanation

This is the largest number possible
 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int index = 0; index < n; index++) {
            arr[index] = sc.next();
        }
        System.out.println(largestNumber(arr));
        sc.close();
    }

    public static String largestNumber(String[] arr) {

        int n = arr.length;
        Arrays.sort(arr, (a, b) -> {
            long n1 = Long.parseLong(a + b);
            long n2 = Long.parseLong(b + a);
            if (n1 > n2) {
                return 1;
            } else if (n1 < n2) {
                return -1;
            } else {
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder("");
        for (int i = n - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        if (sb.charAt(0) == '0')
            return "0";
        return sb.toString();
	}
}