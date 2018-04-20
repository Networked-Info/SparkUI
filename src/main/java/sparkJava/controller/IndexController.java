package sparkJava.controller;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import sparkJava.Page;

public class IndexController {
	
	private String request;
	private String response;
	
	public IndexController(String request, String response) {
		this.request = request;
		this.response = response;
	}
	
	public static String serveHomePage() {
		return Page.indexString();
		
	}

}
