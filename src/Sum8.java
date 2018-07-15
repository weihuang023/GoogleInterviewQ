
public class Sum8 {

	public static void main(String[] args) {
		int myList[] = {1, 2, 3, 3};
		int len = myList.length-1;
		int iteration = 0;
		int count = 0;
		for (int i = 0; i <= len; i++) 
		{
			iteration++;
			System.out.println("Iteration+++++++++++++l "+iteration+" +++++++++++++++++++++++");
			for (int j = i+1; j <= len; j++)
			{
				System.out.println(myList[i]+myList[j]);
				count++;
				System.out.println("Count "+count);
			}
		}
	}
}
