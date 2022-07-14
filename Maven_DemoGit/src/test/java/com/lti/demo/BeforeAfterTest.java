package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Caluclator;

class BeforeAfterTest {
	int sum;
	
	Caluclator c = new Caluclator();
	@BeforeAll
	public static void testDbConn()
	{
		System.out.println("connected DB");
	}
	
	@BeforeEach
	public void testStartUp()
	{
		sum = 0;
		System.out.println("sum = 0");
	}
	
	@Test
	public void testAdd()
	{
		sum = c.add(100, 200);
		Assertions.assertEquals(300, sum);
	}
	
	@Test
	public void testAdd1()
	{
		sum = c.add(100, 200);
		Assertions.assertEquals(300, sum);
	}
	
	@AfterEach
	public void testShutDown()
	{
		sum = 0;
		System.out.println("sumshutdown  = 0");
	}
	
	@AfterAll
	public static void testDbConnNull()
	{
		System.out.println("disconnected DB");
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
