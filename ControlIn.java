import java.io.IOException;

public class ControlIn

{
	static int x = 0;
	static int y = 0;
	static String number = "";

	public static void controlNumber(String[][] str, String[][] str2)
			throws IOException

	{

		int numIn = 0;
		boolean controlnummer1 = false;
		boolean controlnummer2 = false;

		do
		{
			System.out.print("Enter a number: ");
			// boolean controlnummer1 = false;
			// boolean controlnummer2 = false;
			numIn = NumberIn.readNumber();
			number = Integer.toString(numIn);

			for (int i = 0; i < str.length; i++)
			{
				for (int j = 0; j < str[i].length; j++)
				{
					if (str[i][j].contains(number))
					{
						controlnummer1 = true;
					}
				}
			}

			if (numIn > 0 && numIn <= 8)
			{
				controlnummer2 = true;
			}

		}
		while (controlnummer1 != true || controlnummer2 != true);
		forsok1: for (x = 0; x < str.length; x++)
		{
			for (y = 0; y < str[x].length; y++)
			{
				// x = l;
				if (str[x][y].equals(number))
				{
					break forsok1;
				}
			} // for 2
		} // for 1

		str[x][y] = str2[x][y];

	}

	static int getValue1()
	{
		return x;
	}

	static int getValue2()
	{
		return y;
	}

	static String getNumber()
	{
		return number;
	}
}
