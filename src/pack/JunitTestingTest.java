package testing;

import junit.framework.TestCase;

public class JunitTestingTest extends TestCase {

	public void testSquare() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
