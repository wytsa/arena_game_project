package arena;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	/*
	 * testing of the basic Player creation
	 */
	@Test
	public void playerTest() {
		Player test = new Player();
		assertEquals("Strength must be 10", 10, test.strength);
		assertEquals("Dex must be 10", 10, test.dex);
		assertEquals("Con must be 10", 10, test.con);
		assertEquals("Body must be 10", 10, test.body);
		assertEquals("Intel must be 10", 10, test.intel);
		assertEquals("Ego must be 10", 10, test.ego);
		assertEquals("Preception must be 10", 10, test.prec);
		assertEquals("Comliness must be 10", 10, test.com);
		test.printStats();
		//fail("Not yet implemented");
	}
	
	/*
	 * testing of the basic Player creation
	 */
	@Test
	public void monsterTest() {
		Monster test = new Monster();
		assertEquals("Strength must be 10", 10, test.strength);
		assertEquals("Dex must be 10", 10, test.dex);
		assertEquals("Con must be 10", 10, test.con);
		assertEquals("Body must be 10", 10, test.body);
		assertEquals("Intel must be 10", 10, test.intel);
		assertEquals("Ego must be 10", 10, test.ego);
		assertEquals("Preception must be 10", 10, test.prec);
		assertEquals("Comliness must be 10", 10, test.com);
		test.printStats();
		//fail("Not yet implemented");
	}
}
