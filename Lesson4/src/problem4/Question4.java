package problem4;

public class Question4 {
	public static boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));
		return false;
	}

	public static void main(String[] args) {
		String st1 = "MUM";
		String st2 = "Maharishi University";
		System.out.println("MUM is a palindrome :" + " " + isPalindrome(st1));
		System.out.println("Maharishi University is a palindrome :" + " " + isPalindrome(st2));
	}
}
/*Output
MUM is a palindrome : true
Maharishi University is a palindrome : false
*/