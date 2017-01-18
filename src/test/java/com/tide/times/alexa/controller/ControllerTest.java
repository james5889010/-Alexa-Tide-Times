package com.tide.times.alexa.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tide.times.alexa.domain.Greeting;

public class ControllerTest {

	private Controller controller;

	@Before
	public void setup() {
		controller = new Controller();
	}

	@Test
	public void testGreeting() {

		Greeting greeting = controller.greeting("test");
		
		assertEquals(1, greeting.getId());
		assertEquals("Hello, test!", greeting.getContent());
	}

}
