package sparkJava.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import sparkJava.Page;

public class ResultController {
	
	private String request;
	private String response;
	
	public ResultController(String request, String response){
		this.request = request;
		this.response = response;
	}
	
	public static String serverResult(String query) {
		List<String> sample = new ArrayList<>();
		sample.add("hello");
		sample.add("world");
		sample.add(query);
		
		return Page.resultString(sample);
	}

}
