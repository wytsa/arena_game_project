package arena;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	/*
	 * testing of the basic Lifeform creation
	 */
	@Test
	public void test() {
		Lifeform test = new Lifeform();
		assertEquals("Strength must be 0", 0, test.strength);
		assertEquals("Strength must be 0", 0, test.dex);
		assertEquals("Strength must be 0", 0, test.con);
		assertEquals("Strength must be 0", 0, test.body);
		assertEquals("Strength must be 0", 0, test.intel);
		assertEquals("Strength must be 0", 0, test.ego);
		assertEquals("Strength must be 0", 0, test.strength);
		assertEquals("Strength must be 0", 0, test.strength);
		//test.printStats();
		//fail("Not yet implemented");
	}
}
