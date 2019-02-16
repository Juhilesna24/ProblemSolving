
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
public class pattern {
    public static void main(String args[])
    {
        int n,i,c,count,m=0,j,k,d=1,l=0;
        int a[]=new int[100];
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        n=in.nextInt();
        for(i=1;i<=10;i++)
        {
            c=i;
            count=1;
            if(c%2!=0)
            {
                for(j=m+1;count<=c;j++)
                {
                    if(j%2!=0)
                    {
                        
                        //System.out.println(count);
                        a[d]=j;
                        m=a[d];
                        //System.out.println(a[d]);
                        d++;
                        count=count+1;
                    }
                }
            }
            else if(c%2==0)
            {
                for(k=l+1;count<=c;k++)
                {
                    if(k%2==0)
                    {
                        //System.out.println(k);
                        a[d]=k;
                        l=a[d];
                        //System.out.println(a[d]);
                        d++;
                        count=count+1;
                    }
                }
            }
        }
            for(d=1;d<=n;d++)
            {
             System.out.println(a[d]);
            }
        
        
    }
    
}
