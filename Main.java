 import java.util.Scanner; //import scanner class public 
 
 class Main //start main class 
 {
     public static void main(String args[]) //start main method 
     { 
         Scanner sc = new Scanner(System.in); //create a scanner object 
         int num = sc.nextInt(); //enter number of integers 
         
         if(num<20) // check number of integers are less than 20 
         { 
            int[] a = new int[num]; //create an integer array 
            int i; 
            for(i=0;i<num;i++) 
            { 
                a[i] = sc.nextInt(); //enter the integers into array 
            } 
            int lwl = sc.nextInt(); //enter lower bound 
            int upl = sc.nextInt(); //enter upper bound 
            for(i=0;i<num;i++) 
            { 
                if(a[i]>=lwl && a[i]<=upl) //check the integers are in between the range 
                { 
                    System.out.print(a[i]+" "); //print the range elements 
                } 
            } 
         } 
         else 
         { 
             System.out.println("Number of integers must be less than 20."); 
         } 
     } 
 } 
         
         
