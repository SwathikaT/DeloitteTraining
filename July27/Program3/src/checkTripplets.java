
import java.io.*;


class UserMainCode
{
	static int n=0,element;
	static boolean result;
	public static boolean checkTriplets(int ar[])
	{
		for(int i : ar)
		{
			n++;
		}
		int count[] = new int[100];
		
		for(int i=0;i<n;i++)
		{
			element=ar[i];
			for(int j=i+1;j<n;j++)
			{
				if(element == ar[j])
				{
					count[element]++;
					if(count[element]==3)
					{
						
						return true;
					}
				}
			}
		} 
		return false;
	}
}

public class checkTripplets
{
	public static void main(String ar[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the array size :\n");
		int n = Integer.parseInt(br.readLine());
		int arr[]= new int[n];
		System.out.println("Enter the elements in order:");
		for(int i=0;i<n;i++)
		{
				//System.out.println("Element "+(i+1) +" : ");
				arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Result: "+UserMainCode.checkTriplets(arr));
	}
}

