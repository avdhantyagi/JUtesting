package JUT;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddInt {

	@Test
	public void test() {
		JUunitFunctions ju = new JUunitFunctions();
		int res = ju.AddInt(10, 20);
		assertEquals (30, res);
	}

}
