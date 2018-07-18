import java.util.Scanner;

public class DynamicP {

	public static long fibN(int n) 
	{
		long result = 0;
		
		long arr[] = new long[n];
		
		arr[0] = 0;
		arr[1] = 1;
	
		if (n ==1)
		{
			result = 1;
		}
		else 
		{
			for (int i = 2; i < n; i++)
			{
				arr[i] = arr[i-1] + arr[i-2];
				result = arr[i];
			}	
		}

	     return result;
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
		Scanner s = new Scanner(System.in);
		System.out.print("Enter A Range: ");
		int n =  s.nextInt();
		System.out.println("Fibonacci("+n+")= "+fibN(n));
		System.out.println("Fibonacci("+n+")= "+fib1(n));

	}
 }
