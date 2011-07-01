package org.bitstorm.gameoflife;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest extends TestCase {
	
	private GameOfLifeGrid g1, g2;

	@Before
	public void setUp() {
        g1 = new GameOfLifeGrid(1, 1);
        g2 = new GameOfLifeGrid(5, 5);
    }


	@Test
	public final void testGameOfLifeGrid() {
		assertFalse(g1.getCell(0, 0));		
	}
	
	@Test
	public final void testCellSet() {
		g1.setCell(0,0, true);
		assertTrue(g1.getCell(0,0));
		g2.setCell(4,4, true);
		assertTrue(g2.getCell(4,4));
		assertFalse(g2.getCell(3,3));
	}

	@Test
	public final void testNext() {
		g2.setCell(3, 3, true);
		g2.next();
		Cell cell33 = g2.getCellObj(2, 2);
		Cell cell23 = g2.getCellObj(2, 3);
		assertEquals(1, cell23.neighbour);
		assertEquals(0, cell33.neighbour);
	}
}
