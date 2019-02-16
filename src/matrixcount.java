
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
public class matrixcount {
    public static void main(String args[])
    {
        int n,i,j,c=0,x,k,l,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        n=in.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("enter a matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("enter b matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=in.nextInt();
            }
        }
        System.out.println("enter x");
        x=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<n;k++)
                {
                    for(l=0;l<n;l++)
                    {
                        d=a[i][j]+b[k][l];
                        if(d==x)
                        {
                            c=c+1;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }   
}

