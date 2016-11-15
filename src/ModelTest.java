import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ModelTest extends TestCase{
	private CalModel cm;
	private int a, b;
	@Before
	public void setUp() throws Exception {
		cm = new CalModel();
		a = 40;
		b = 10;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		cm.add(a, b);
		assertEquals(50, cm.getResult());
	}

	@Test
	public void testSub() {
		cm.sub(a, b);
		assertEquals(30, cm.getResult());
	}

	@Test
	public void testDiv() {
		cm.div(a, b);
		assertEquals(4, cm.getResult());
	}

	@Test
	public void testMul() {
		cm.mul(a, b);
		assertEquals(400, cm.getResult());
	}
	
	@Test
	public void testgetResult(){
		assertEquals(0, cm.getResult());
	}



}
