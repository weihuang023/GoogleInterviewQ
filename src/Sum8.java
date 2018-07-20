
public class Sum8 {
	public void addNum(int myList[]) {
		//int sum = 0;
		int count = 0;
		int len = myList.length-1;
		int arr[] = new int[10000];
		for (int i = 0; i <= len - 1; i++) 
		{
			//System.out.print(myList[i]);
			for (int j = i+1; j <= len; j++)
			{
				//System.out.print("+"+myList[j]);
				arr[count] = myList[i]+myList[j];
				if (arr[count]==8) 
		    		System.out.println(myList[i] + " + " + myList[j] + " = 8" );;
				count++;
		    	
			}
		}
	    //System.out.println(count);
	    for (int i =0 ; i<= count-1; i++ )
	    {
	    	//System.out.println(+i+" "+arr[i]);
	    	if (arr[i]==8) 
	    		System.out.print("GOT 8 ");
	    	
	    }
	    System.out.println(" ");;
	    //return count;
	}
	
	public static void main(String[] args) {
		Sum8 sum = new Sum8();
		int myList[] = {1, 2, 4, 4,3 ,3,4,5,6,7,8,9,0,0,8,7};
		//sum.addNum(myList);
	    sum.addNum(myList);
	}
}
