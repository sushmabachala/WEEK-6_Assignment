package com.state.screen;

import com.builder.screen.ScreenBuilder;
import com.builder.screen.ScreenProp;

public class OrderScreens {
	
	
	public static void main(String[] args) {
		
		//Builder pattern 
		ScreenProp dellScreen = new ScreenBuilder().setBrand("Dell").setType("LED").setPrice(15000).build();
		
		ScreenProp hpScreen = new ScreenBuilder().setBrand("HP").setType("LED").setPrice(20000).build();

		System.out.println(dellScreen);
		System.out.println(hpScreen);
		//State pattern to order screens 
		Screen screen = new Screen();
		
		screen.prepareScreen();
		screen.testScreen();
		screen.deliverScreen();
		
	}

}
