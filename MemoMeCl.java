import java.io.IOException;
import java.util.Arrays;

public class MemoMeCl
{

	public static void main(String[] args) throws IOException
	{

		int control = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		// int controlnummer1 = 0;
		// int controlnummer2 = 0;
		String number1 = "";
		String number2 = "";
		// int numIn1 = 0;
		// int numIn2 = 0;

		// int x = 0;
		// int y = 0;

		String display[][] = {
				{ "1", "2", "3", "4" },
				{ "5", "6", "7", "8" }
		};
		String origin[][] = {
				{ "A", "C", "B", "A" },
				{ "D", "B", "D", "C" }
		};

		// myMemoryGame = new MemoryGame();

		do
		{

			PrintDisplay.printArray(display);

			ControlIn.controlNumber(display, origin);

			k = ControlIn.getValue1();
			l = ControlIn.getValue2();
			number1 = ControlIn.getNumber();

			PrintDisplay.printArray(display);

			ControlIn.controlNumber(display, origin);

			m = ControlIn.getValue1();
			n = ControlIn.getValue2();
			number2 = ControlIn.getNumber();

			PrintDisplay.printArray(display);

			if (!(display[k][l].equals(display[m][n])))
			{
				display[k][l] = number1;
				display[m][n] = number2;
			} // if

			if (Arrays.deepEquals(origin, display))
			{
				control = 1;
			}
			// myMemoryGame.reset()
			k = 0;
			l = 0;
			m = 0;
			n = 0;
			number1 = "";
			number2 = "";

		}
		while (control != 1);

		System.out.println("Thank you for the game!");

	}// main
}// memorystring
