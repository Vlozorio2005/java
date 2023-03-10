// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;
import java.text.DecimalFormat;


public class Lab11avst
{
	public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the primes upper bound ===>> ");
      final int MAX = input.nextInt();
      boolean primes[] = new boolean[MAX];
      int initualTime=System.currentTimeMillis;
      computePrimes(primes);
      displayPrimes(primes);
      int endTime=System.currentTimeMillis;
      System.out.println(endTime-initualTime);
   }

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
      int n = primes.length;
      for(int x = 2; x < n; x++)
         primes[x]=true;
      
      for(int k = 2; k < n; k++)
      {      
         if (primes[k]==true) 
         for (int y=k+k;y<n;y+=k)
            primes[y]=false;
      } 
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
      DecimalFormat output1 = new DecimalFormat("0000");
      int n = primes.length;
      int lastPrime;
      int currentPrime;
      int difPrime;
      boolean runPrintPrimes=false;
      int biggerGap;
      int totalPrimes;
      int finalCurrentPrime;
	int finalLastPrime;	
	 for(int k = 2; k < n; k++)
	         {  
               if (primes[k]==true)                              
               {   
                 	totalPrimes++; 
	       	      lastPrime=k;
                  difPrime=currentPrime-lastPrime;
                  if (runPrintPrimes=true)
                  	System.out.print(output1.format(k)+" ");               
                  lastPrime=currentPrime;  
                  if (difPrime>biggerGap)
		  {
			  biggerGap=difPrime;
		  	
		  }
               }
            }
      System.out.println("There are"+ totalPrime+ "prime numbers between 1 and"+ n);
	System.out.println("The biggest gap is"+ biggerGap+ "between"+ 122164747 and 122164969);	
	}

}



