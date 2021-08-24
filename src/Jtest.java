import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.jupiter.api.*;

public class Jtest {
		@BeforeAll
		public static void m1() { System.out.println("Before ALL"); }
		
		@AfterAll
		public static void m2() { System.out.println("After ALL"); }
		
		@AfterEach
		public  void m3() { System.out.println("After Each"); }
		
		@BeforeEach
		public  void m4() { System.out.println("Before Each"); }
		
		//Testing
		
	
		@Ignore
		public void testAdd(){
			System.out.println("test1");
			int addition=Main.add(123, 124);
			assertEquals(247,addition);
		}
		
	
		@Ignore
		public void testdiv(){
			System.out.println("test3");
			int result=Main.div(12,2);
			assertEquals(6,result);
		}
		
		@Test
		public void testAddEntry()
		{
			int result=Main.addEntry(1,"siva");
			String oldName=Main.updateEntry(1,"prakash");
			assertEquals("siva",oldName);
			assertEquals(1,result);
			assertEquals("prakash",Main.fetchEntry(1));
			assertEquals("prakash",Main.deleteEntry(1));
					
		}			
	}