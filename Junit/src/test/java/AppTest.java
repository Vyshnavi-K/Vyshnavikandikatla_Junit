import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class AppTest {

	@Test
	public void test() {
		Main m;
		
		@Before
		public void initalize()
		{
			m = new Main();
		}

		@Test
		public void test1() 
		{
			assertEquals("BCD",m.removeA("ABCD"));
		}
		
		@Test
		public void test2() 
		{
			assertEquals("CD",m.removeA("AACD"));
		}
		
		@Test
		public void test3() 
		{
			assertEquals("BCD",m.removeA("BACD"));
		}
		
		@Test
		public void test4() 
		{
			assertEquals("BBAA",m.removeA("BBAA"));
		}
		
		@Test
		public void test5() 
		{
			assertEquals("BAA",m.removeA("AABAA"));
		
	}

}
