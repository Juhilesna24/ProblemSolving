
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
public class problem {
    
    public static void main(String args[])
    {
        int n,i,r,k=0,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("enter array");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("process");
        for(i=0;i<n;i++)
        {
            while(a[i]>0)
            {
                r=a[i]%10;
                k=k*10+r;
                a[i]=a[i]/10;
            }
            b[i]=k;
            k=0;
        }
        for(i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
           if(b[i]>b[j])
           {
               temp=b[i];
               b[i]=b[j];
               b[j]=temp;
           }
        }
        }
        int min=b[0]-b[1];
        System.out.println("Minimum difference is"+min);
    }
}

