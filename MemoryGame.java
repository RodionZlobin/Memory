
import java.io.IOException;
import java.util.Arrays;

public class MemoryGame
{

	public static void main(String[] args) throws IOException
	{

		VariablerMemory myVar = new VariablerMemory();

		do
		{

			PrintDisplay.printArray(myVar.display);

			ControlIn.controlNumber(myVar.display, myVar.origin);

			myVar.k = ControlIn.getValue1();
			myVar.l = ControlIn.getValue2();
			myVar.number1 = ControlIn.getNumber();

			PrintDisplay.printArray(myVar.display);

			ControlIn.controlNumber(myVar.display, myVar.origin);

			myVar.m = ControlIn.getValue1();
			myVar.n = ControlIn.getValue2();
			myVar.number2 = ControlIn.getNumber();

			PrintDisplay.printArray(myVar.display);

			if (!(myVar.display[myVar.k][myVar.l].equals(myVar.display[myVar.m][myVar.n])))
			{
				myVar.display[myVar.k][myVar.l] = myVar.number1;
				myVar.display[myVar.m][myVar.n] = myVar.number2;
			} // if

			if (Arrays.deepEquals(myVar.origin, myVar.display))
			{
				myVar.control = 1;
			}

		}
		while (myVar.control != 1);

		System.out.println("Thank you for the game!");

	}// main
}// memorystring
