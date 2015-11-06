
public class ProvPrint
{

	public static void main(String[] args)
	{

		String display[][] = {
				{ "1", "2", "3", "4" },
				{ "5", "6", "7", "8" }
		};
		// for(String row[]:display){
		// for(String col:row){

		System.out.println("-----------------------------------------------------------------");
		for (String x[] : display)
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
