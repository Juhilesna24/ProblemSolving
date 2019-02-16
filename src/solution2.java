
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my pc
 */
public class solution2 {
    public static void main(String args[])
    {
        int n,i,x,y,c=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        x=in.nextInt();
        y=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=in.nextInt();
        }
        
       for(i=0;i<n;i++)
       {
           if(a[i]>=b[i])
           {
               c=c+a[i];
           }
           else
           {
               c=c+b[i];
           }
           
           
       }
        System.out.println(c);
        
    }
    
}
