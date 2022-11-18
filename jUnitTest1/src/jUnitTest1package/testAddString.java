package jUnitTest1package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitTest1Function jUnitstring = new jUnitTest1Function();
		String result = jUnitstring.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
