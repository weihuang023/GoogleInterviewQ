
public class Sum8 {

	public void addNum(int myList[]) {
		int iteration = 0;
		int count = 0;
		int len = myList.length-1;
		for (int i = 0; i <= len; i++) 
		{
			iteration++;
			System.out.println("Iteration +++++++++++++ "+iteration+" +++++++++++++++++++++++");
			for (int j = i+1; j <= len; j++)
			{
				System.out.println("Add Two Num: " +(myList[i]+myList[j]));
				count++;
				System.out.println("Count "+count);
			}
			System.out.println("========= +++++++++++++ "+iteration+" +++++++++++++++++++++++");
		}
	}
	
	public int foundLess8(int myList[]) {
		int getLess8 = 0;
		
		for (int i = 0; i<= myList.length -1; i++)
		{
			if (myList[i] <= 8) 
			{
				//System.out.println("Found Num Less than 8: " +myList[i]);
				int arr [] = new int[myList.length];
				getLess8 = myList[i];
			}
			else
			{
				//System.out.println("No Num found...................");
			}
		}
		return getLess8;
	}
	
	public static void main(String[] args) {
		Sum8 sum = new Sum8();
		int myList[] = {1, 2, 3, 3, 9, 9, 9, 9, 1, 9};
		//sum.addNum(myList);
		
		sum.foundLess8(myList);
		
		
	}
}
