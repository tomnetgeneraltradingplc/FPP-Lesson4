package problem5;

import static org.junit.Assert.*;

import org.junit.Test;

import problem2.minimumChar;

public class TestminimumChar {

	@Test
	public void testMinChar() {
		String inputString = "zyxvwhijkabcdef";
		minimumChar min = new minimumChar();
		char output = min.minChar(inputString);
		char expectedOutput ='a';
		assertEquals(output, expectedOutput);
	}

}
/*Output
Runs 1/1 Errors: 0 Failures: 0
*/