/*
Finger Game
Count the given numbers on your fingers and find the correct finger name of given number
Example 1:
INPUT:17
OUTPUT:Thumb
Example 2:
INPUT: 45
OUTPUT:Little 
*/

import java.util.*;
public class finger {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    int a=obj.nextInt();
    int sum=a%8;

    System.out.println(sum);
    if(sum==1)
    {
        System.out.println("Thumb");
    }
    if(sum==2 || sum==0)
    {
        System.out.println("Index");
    }
    if(sum==3 || sum==7)
    {
        System.out.println("Middle");
    }
    if(sum==4 || sum==6)
    {
        System.out.println("Ring");
    }
    if(sum==5)
    {
        System.out.println("Little");
    }
    
    }
}


