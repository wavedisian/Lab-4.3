//Wes Avedisian & Saurabh Bansal
//Help from Steven Fong
package defaultPackage;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class BackEnd 
{
	public static List<String> CSVreader(String filename)
	{
		List<String> scores = new ArrayList<String>();
		Path pathToFile = Paths.get(filename);
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readline();
			
			while(line != null)
			{
				String[] elements = line.split(",");
				
				for (String s: elements)
				{
					scores.add(s);
				}
				
				line = br.readLine();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		return scores;
	}
	
	public static void updateCSV(String filename, String replace)
	{
		try 
		{
			FileWriter f = new FileWriter(filename, false);
			BufferedWriter b = new BufferedWriter(f);
			PrintWriter p = new PrintWriter(b);
			
			p.print(replace);
			p.flush();
			p.close();
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
