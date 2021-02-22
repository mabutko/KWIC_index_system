import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Output {

	Output(ArrayList<String> input, String output) throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
	    
		for (String element : input) {
			//System.out.println(element);
			writer.write(element.replace("[","").replace("]",""));
			writer.newLine();
		}
		
		
	     
	    writer.close();
	}
	
}
