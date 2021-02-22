//For arguments 0 and 1 - set path to .txt file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
	
	 public static void main(String[] args) throws Exception 
	  { 
		 ReadTextAsString rts = new ReadTextAsString();
		 Split spl = new Split();
		 Circularshift csft = new Circularshift();


 
		 //String data1 = rts.readFileAsString("C:\\Users\\matko\\Desktop\\Read.txt"); 
		String data1 = rts.readFileAsString(args[0]); 
		
	    String[] rsl = spl.SpaceSplit(data1);
	    ArrayList<String> finalData = csft.Circularshiftwords(data1);
	    new AlphabeticalSort(finalData);
	    new Output(finalData, args[1]);
	   // System.out.println(crclrshft);
	  } 

}
