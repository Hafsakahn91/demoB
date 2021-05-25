public class ExceptionHandiling
{
	public static void main(String args[]) 
	{
		int array [] = {8,7,54,3,45,2,4,66,76,4};
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.print(array[i]+" ");
			}
		System.out.println("");	
		System.out.println(array[10]);
			
		}catch(Exception e)
		{
			System.out.println("Array out of Bound!");
		}
	}
}
