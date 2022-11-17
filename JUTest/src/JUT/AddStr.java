package JUT;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddStr {

	@Test
	public void test() {
		JUunitFunctions ju = new JUunitFunctions();
		String res = ju.AddStr("He", "llo");
		assertEquals ("Hello", res);
		
	}

}
