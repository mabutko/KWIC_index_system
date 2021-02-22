// Java Program to illustrate reading from text file 
// as string in Java 
import java.nio.file.*;; 

public class ReadTextAsString 
{
	public static String data;
	
	
  public static String readFileAsString(String fileName)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
  
} 