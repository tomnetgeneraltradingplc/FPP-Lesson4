package problem1;

public class Question1 {//Merge two sorted String
	public static String merge(String str1, String str2)
	{
	if(str1.isEmpty() || str2.isEmpty()) {
	return str1 + str2;
	}
	return str1.substring(0, 1) + str2.substring(0, 1) + merge(str1.substring(1), str2.substring(1));
	}
	public static void main(String[] args) {
	String a="ace";
	String b="bdf";
	System.out.println(merge(a,b));
	}
	}
/*Output
 abcdef
 */
