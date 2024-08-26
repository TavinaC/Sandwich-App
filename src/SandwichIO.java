//Tavina Chen
//May 6 2024
//CS1400 
//Project 2: Sandwich App: Input Output class

//This class provides a static method, writeOrderToFile(Order). 
//This method appends the passed-in order’s content to the output text file, orderline.txt.

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SandwichIO {
	private static String fileName = "orderline.txt";
	
	public static void writeOrderToFile(Order o) throws IOException {
		
		//will automatically create the file if it doesn't exist
		FileWriter fwrite = new FileWriter(fileName, true);
		PrintWriter outputFile = new PrintWriter(fwrite);
		outputFile.println(o);
		outputFile.close();
	}
}
