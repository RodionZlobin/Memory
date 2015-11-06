
public class NumberIn
{
	static int readNumber()
			throws java.io.IOException
	{
		String output = "";
		char currentChar = (char) System.in.read();
		while (currentChar != '\n')
		{

			if (currentChar >= '0' && currentChar <= '9')
			{
				output += currentChar;
			}
			else
			{
				while (System.in.read() != '\n')
					;
				output = "";
				break;
			}
			currentChar = (char) System.in.read();
		}
		if (output.length() > 0)
		{
			return Integer.parseInt(output);
		}
		else
		{
			return -1;
		}
	}
}
