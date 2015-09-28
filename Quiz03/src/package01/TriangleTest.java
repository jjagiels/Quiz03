package package01;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		
		Triangle myTriangle = new Triangle(24, 30, 18);
		
		assertEquals(216, myTriangle.getArea(), 0);
		assertEquals(72, myTriangle.getPerimeter(), 0);
	}

}