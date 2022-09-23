import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		List<String> abc = test("BCAD");

		for (Iterator iterator = abc.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

	public static ArrayList<String> test(String s) {
		if (s.length() == 0)
			return null;
		char tempArray[] = s.toCharArray();

		Arrays.sort(tempArray);
		String test = new String(tempArray);

		ArrayList<String> list = new ArrayList<String>();

		combinations(test, "", list);
		return list;

	}

	public static void combinations(String test, String ans, ArrayList<String> list) {
		if (test.length() == 0) {
			list.add(ans);
			return;
		}

		for (int i = 0; i < test.length(); i++) {
			char ch = test.charAt(i);

			String ros = test.substring(0, i) + test.substring(i + 1);
			combinations(ros, ans + ch, list);
		}
	}
}