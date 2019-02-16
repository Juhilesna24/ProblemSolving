
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
public class matix {
    public static void main(String args[])
    {
        int a[][]=new int[20][20];
        int i,n,j,c=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter n");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        int k=n-1;
        for(i=0;i<n;i++)
        {
          c=c+a[i][k];
          k--;
        }
        System.out.println(c);
        
    }                
}
