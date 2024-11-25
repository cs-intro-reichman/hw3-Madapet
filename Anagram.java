/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function./*
		/*
		 * System.out.println(isAnagram("silent", "listen")); // true
		 * System.out.println(isAnagram("William Shakespeare",
		 * "I am a weakishspeller")); // true
		 * System.out.println(isAnagram("Madam Curie", "Radium came")); // true
		 * System.out.println(isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort"));//
		 * true
		 * 
		 * // Tests the preProcess function.
		 * // System.out.println(preProcess("What? No way!!!"));
		 * 
		 * // Tests the randomAnagram function.
		 * System.out.println("silent and " + randomAnagram("silent") +
		 * " are anagrams.");
		 * // System.out.println(isAnagram("silent", randomAnagram("silent")));
		 * 
		 * // Performs a stress test of randomAnagram
		 * String str = "1234567";
		 * Boolean pass = true;
		 * //// 10 can be changed to much larger values, like 1000
		 * for (int i = 0; i < 10; i++) {
		 * String randomAnagram = randomAnagram(str);
		 * System.out.println(randomAnagram);
		 * pass = pass && isAnagram(str, randomAnagram);
		 * if (!pass) {
		 * System.out.println("1");
		 * break;
		 * }
		 * }
		 * System.out.println(pass ? "test passed" : "test Failed");
		 */
	
	}

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		String testd1 = removeSpaces(preProcess(str1));
		String testd2 = removeSpaces(preProcess(str2));
		int len = testd1.length();
		for (int i = 0; i < len; i++) {
			if (testd2.indexOf(testd1.charAt(i)) == -1 || testd1.indexOf(testd2.charAt(i)) == -1) {
				return false;
			}
		}

		// Replace the following statement with your code
		return true;

	}

	// Returns a preprocessed version of the given string: all the letter characters
	// are converted
	// to lower-case, and all the other characters are deleted, except for spaces,
	// which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		String returned_string = "";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch <= 'z' && ch >= 'a') || (ch >= '0' && ch <= '9') || (ch == ' ')) {
				returned_string = returned_string + ch;
			}

		}
		// Replace the following statement with your code
		return returned_string;
	}

	// Returns a random anagram of the given string. The random anagram consists of
	// the same
	// characters as the given string, re-arranged in a random order.
	public static String randomAnagram(String str) {
		// Replace the following statement with your code
		String tmp_str = preProcess(str);
		String returned_string = "";

		while (tmp_str.length() > 0) {
			int tmp_index = (int) (tmp_str.length() * Math.random());

			returned_string = returned_string + tmp_str.charAt(tmp_index);

			tmp_str = tmp_str.substring(0, tmp_index) + tmp_str.substring(tmp_index + 1, tmp_str.length());

		}

		return returned_string;
	}

	public static String removeSpaces(String str){
		String returned_string = "";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch <= 'z' && ch >= 'a') || (ch >= '0' && ch <= '9')) {
				returned_string = returned_string + ch;
			}

		}
		// Replace the following statement with your code
		return returned_string;
	
	}
}
