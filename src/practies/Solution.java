/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static int sockMerchant(int n,int[] a)
    {
        int count=0;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count=count+1;
                i=i+1;
            }
        }
        return count;
    }
  public static void main(String args[])
  {
      int i,n;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n");
      n = in.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
          a[i]=in.nextInt();
      }
      int result= sockMerchant(n,a);
      System.out.println(result);
      
  }
}
