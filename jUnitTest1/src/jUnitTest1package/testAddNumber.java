package jUnitTest1package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		jUnitTest1Function jUnit = new jUnitTest1Function();
		int result = jUnit.addnumbers(100,200);
		assertEquals (300,result);
	}

}
