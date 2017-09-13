package problem2;

public class TestQuestion2 {
	public static void main(String[] args) {
		minimumChar min = new minimumChar();
		System.out.println("Input String 1 : " + "zyxvwhijkabcdef");
		System.out.println("Minimum Char " + min.minChar("zyxvwhijkabcdef"));
		System.out.println("Input String 2 : " + "akel");
		System.out.println("Minimum Char " + min.minChar("akel"));
		}
		}

/*Output
Input String 1 : zyxvwhijkabcdef
Minimum Char a
Input String 2 : akel
Minimum Char a
*/