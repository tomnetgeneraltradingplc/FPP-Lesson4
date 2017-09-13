package problem5;

import static org.junit.Assert.*;

import org.junit.Test;

import problem2.minimumChar;
import problem4.Question4;

public class TestPalindrome {

	@Test
	public void test() {
		String inputString = "Maharishi University";
		Question4 pal = new Question4();
		boolean output = pal.isPalindrome(inputString);
		boolean expectedOutput =false;
		assertEquals(output, expectedOutput);
	}

}
/*Output
Runs 1/1 Errors: 0 Failures: 0
*/