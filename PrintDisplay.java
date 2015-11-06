
public class PrintDisplay
{

	public static void printArray(String str[][])
	{
		System.out.println("-----------------------------------------------------------------");
		for (String x[] : str)
		{
			for (String y : x)
			{
				System.out.print("|\t" + y + "\t");

			} // for 2
			System.out.print("|");
			System.out.println();

			System.out.println("-----------------------------------------------------------------");
		}
	}
}
