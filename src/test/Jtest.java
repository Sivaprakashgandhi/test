package test;

import static org.junit.Assert.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Ignore;
import org.junit.jupiter.api.*;

import my.Main;

public class Jtest {
		static Logger logger = Logger.getAnonymousLogger();
		@BeforeAll
		public static void m1() { logger.log(Level.INFO,"Before ALL"); }
		
		@AfterAll
		public static void m2() { logger.log(Level.INFO,"After ALL"); }
		
		@AfterEach
		public  void m3() { logger.log(Level.INFO,"After Each"); }
		
		@BeforeEach
		public  void m4() { logger.log(Level.INFO,"Before Each"); }
		
		//Testing
		
	
		@Ignore
		public void testAdd(){
			logger.log(Level.INFO,"test1");
			int addition=Main.add(123, 124);
			assertEquals(247,addition);
		}
		
	
		@Test
		public void testdiv(){
			logger.log(Level.INFO,"test3");
			int result=Main.div(12,2);
			assertEquals(7,result);
		}
		
		@Test
		public void testAddEntry()
		{
			int result=Main.addEntry(1,"siva");
			String oldName=Main.updateEntry(1,"prakash");
			assertEquals("siva",oldName);
			assertEquals(1,result);
					
		}			
	}