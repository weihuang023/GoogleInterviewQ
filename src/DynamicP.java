import java.util.Scanner;

public class DynamicP {

	public  long fibN(int n) 
	{
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		
		long arr[] = new long[n+1];
		
		arr[0] = 0;
		arr[1] = 1;
	
		for (int i = 2; i <= n; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}	
		
		for (int i = 0; i <= n; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	    return arr[n];
	}
	
    public static long fib1(int n) 
    {
    	long n1=0,n2=1,sumOfPreTwo=0;
    	for (int i = 2; i < n; i++)
    	{
    		sumOfPreTwo = n1+n2;
    		n1 = n2;
    		n2 = sumOfPreTwo;
    	}
    	
        return sumOfPreTwo;
    }
   
	public static void main(String[] arg) {
		
		DynamicP dp = new DynamicP();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A Range: ");
		int n =  s.nextInt();
		System.out.println("Fibonacci("+n+")= "+dp.fibN(n));
//		System.out.println("Fibonacci("+n+")= "+fib1(n));

	}
 }
