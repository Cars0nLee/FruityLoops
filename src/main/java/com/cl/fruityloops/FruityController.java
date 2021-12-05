package com.cl.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FruityController {
	@RequestMapping("/")
	public String home(Model fruitInfo) {
		ArrayList<Item> fruits = new ArrayList<Item>();
		fruits.add(new Item("Kiwi", 1.5));
		fruits.add(new Item("Mango", 2.0));
		fruits.add(new Item("Goji Berries", 4.0));
		fruits.add(new Item("Apple", 0.75));
		
		fruitInfo.addAttribute("fruits", fruits);
		
		return "index.jsp";
	}
}
