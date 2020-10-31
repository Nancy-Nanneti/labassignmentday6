package labassignmentday6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class WordFrequency {
public static void main(String[] args) {
	
		HashMap<String, Integer> wordCount = new HashMap<>();

		File file = new File("data.txt"); 
		try {
		  FileReader reader = new FileReader(file);
		  BufferedReader br = new BufferedReader(reader);

		  String line = br.readLine();
			br.close();

		  String[] words = line.split(" ");
		  int freq = 0;

		  for (int i = 0; i < words.length; i++) {

		    if (wordCount.containsKey(words[i])) {         
		      wordCount.put(words[i], freq++);
		    }
		    else {
		      wordCount.put(words[i], freq++);
		    }
		  }
		}
		catch (FileNotFoundException fnfe) {
		  System.out.println("File not found.");
		}
		catch (Exception e) {
		  System.out.print(e);
		   }
		 
		System.out.println(wordCount+"\n");
		}
}
