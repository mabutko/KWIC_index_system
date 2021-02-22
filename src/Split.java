import java.io.IOException;
import java.util.ArrayList;

public class Split extends ReadTextAsString {

	public static String[] SpaceSplit(String text) throws IOException {
				
		String[] result = text.split(" ");

		
		//for (String res : result )
		//{
			//System.out.println(res);
		//	vv.add(res);
		//	output.write(vv.toString(), "C:\\Users\\matko\\Desktop\\Ouput.txt");
			
		//}
		
		return result;
		
}
}
