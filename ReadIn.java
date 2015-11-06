
public final class ReadIn
{
	public String[] attempt()
			throws java.io.IOException
	{

		String[] attempt = new String[5];

		String output = "";
		do
		{
			char currentChar = (char) System.in.read();

			while (currentChar != '\n')
			{
				if (currentChar >= '1' && currentChar <= '8')
				{
					output += currentChar;
					if (output.length() == 5)
						break;
				}
				else
				{
					while (System.in.read() != '\n')
						;
					output = "";
					break;
				}
				currentChar = (char) System.in.read();
			} // while

		}
		while (output.length() < 5); // do
		System.out.println(output);
		System.out.println(output.substring(0, 1));

		for (int i = 0; i < output.length(); i++)
		{
			attempt[i] = output.substring(i, i + 1);
		}

		for (int i = 0; i < attempt.length; i++)
		{
			System.out.print(attempt[i] + " ");
			System.out.println();
		}
		return attempt;

		// return Integer.parseInt(output);

	} // metod
} // class
