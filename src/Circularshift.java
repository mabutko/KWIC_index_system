import java.util.ArrayList;
import java.util.Arrays;

public class Circularshift extends ReadTextAsString {

	public static ArrayList<String> Circularshiftwords(String all_lines) throws Exception {

		ArrayList<String> vv = new ArrayList<String>();

		String[] temp = all_lines.split("\\r\\n|\\n|\\r");
		String result = "";
		System.out.println("test1"+Arrays.toString(temp));
		
		for (int g = 0; g < temp.length; g++) {
			String[] list = temp[g].split(" ");
			System.out.println(g);
			System.out.println(Arrays.toString(list).replace("[","").replace("]",""));
			vv.add(Arrays.toString(list));
			// System.out.print("\n"+temp[g]);
			
			for (int j = 0; j < list.length - 1; j++) {

				for (int i = 0; i < list.length - 1; i++) {
					String tmp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = tmp;
					
					//System.out.print("\n");
				}
				System.out.println(Arrays.toString(list).replace("[","").replace("]",""));
				vv.add(Arrays.toString(list));
			}
		}
		System.out.println("All data stores here:"+ vv.toString());
		return vv;

	}

}
