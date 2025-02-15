// // Given a number n, print all primes smaller than or equal to n. 
// // It is also given that n is a small number. 
// // For example, if n is 10, the output should be “2, 3, 5, 7”. 
// // If n is 20, the output should be “2, 3, 5, 7, 11, 13, 17, 19”.  

// // Java program to print all primes smaller than or equal to
// // n using Sieve of Eratosthenes

// class SieveOfEratosthenes
// {
// 	void sieveOfEratosthenes(int n)
// 	{
// 		// Create a boolean array "prime[0..n]" and initialize
// 		// all entries it as true. A value in prime[i] will
// 		// finally be false if i is Not a prime, else true.
// 		boolean prime[] = new boolean[n+1];
// 		for(int i=0;i<=n;i++)
// 			prime[i] = true;
		
// 		System.out.println("Initial Boolean Array:");
// 		for(int i=0;i<=n;i++)
// 			System.out.print(prime[i]);
		
// 		for(int p = 2; p*p <=n; p++)
// 		{
// 			// If prime[p] is not changed, then it is a prime
// 			if(prime[p] == true)
// 			{
// 				// Update all multiples of p
// 				for(int i = p*p; i <= n; i += p)
// 					prime[i] = false;
// 			}
// 		}
		
// 		// Print all prime numbers
// 		for(int i = 2; i <= n; i++)
// 		{
// 			if(prime[i] == true)
// 				System.out.print(i + " ");
// 		}
// 	}
	
// 	public static void main(String args[])
// 	{
// 		int n = 30;
// 		System.out.print("Following are the prime numbers ");
// 		System.out.println("smaller than or equal to " + n);
// 		SieveOfEratosthenes g = new SieveOfEratosthenes();
// 		g.sieveOfEratosthenes(n);
// 	}
// }


class Main
{
	static void sieveOfEratosthenes(int n)
	{
		// Create a boolean array "prime[0..n]" and initialize
		// all entries it as true. A value in prime[i] will
		// finally be false if i is Not a prime, else true.
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i] = true;
		
		System.out.println("\nInitial Boolean Array:");
		for(int i=0;i<=n;i++)
			System.out.print(prime[i]+" ");
		
		for(int p = 2; p*p <=n; p++)
		{
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(int i = p*p; i <= n; i += p)
					prime[i] = false;
			}
		System.out.print("\n\nIntermediate for p= "+p+"\n");
		for(int i=0;i<=n;i++)
			System.out.print(i+"-"+prime[i]+" ");	
		
		}
		System.out.println("\n\n");
		// Print all prime numbers
		for(int i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[])
	{
		int n = 30;
		System.out.print("Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		sieveOfEratosthenes(n);
	}
}