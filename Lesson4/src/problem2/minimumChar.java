package problem2;

public class minimumChar {
	private String sort(String mytext) {
		if (mytext.length() < 1)
		return mytext;
		int pos = 0;
		char minpos = mytext.charAt(0);
		for (int i = 1; i < mytext.length(); i++) {
		char ch = mytext.charAt(i);
		if (ch < minpos) {
		minpos = ch;
		pos = i;
		}
		}
		return minpos + sort(mytext.substring(0, pos) + mytext.substring(pos + 1));
		}
		public char minChar(String inputString){
		return sort(inputString).charAt(0);
		}
}
