import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticalSort {

	AlphabeticalSort(ArrayList<String> data){
		Collections.sort(data, String.CASE_INSENSITIVE_ORDER);
	}
	
	
}
