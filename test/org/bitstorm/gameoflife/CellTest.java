/**
 * 
 */
package org.bitstorm.gameoflife;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * @author pitosalas
 *
 */
public class CellTest {

	/**
	 * Test method for {@link org.bitstorm.gameoflife.Cell#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {
		Cell c = new Cell(10, 10);
		Cell d = new Cell(10,10);
		assertEquals (c, d);		
	}
	
	public final void testNotEquals() {
		Cell c = new Cell(10, 10);
		Cell d = new Cell(10,11);
		assertThat(c, not(equalTo(d)));
//		assertFalse(c.equals(d));

	}

}
