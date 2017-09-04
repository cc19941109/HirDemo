package com.chen.spring.test;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.chen.controller.HomeController;

public class HomeControllerTest {

	@Test
	public void testHomePage(){
		HomeController controller = new HomeController();
		assertEquals("home", controller.home());
	}
	
	@Test
	public void testHomeSpring() throws Exception{
		
		HomeController controller = new HomeController();
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		mockMvc.perform(get("/test1/s")).andExpect(view().name("home"));
		mockMvc.perform(get("/test2/s")).andExpect(view().name("home"));

	}
	
}
