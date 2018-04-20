package sparkJava;

import static spark.Spark.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;
import sparkJava.controller.IndexController;
import sparkJava.controller.ResultController;

public class SparkUI {
	public static void main(String[] args) {
		SparkConf sparkConf = new SparkConf()
				.setAppName("cosi132g1")
				.setMaster("local[*]");
		JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);
		
		
		get("/", (req, res) -> IndexController.serveHomePage());
		
		post("/result", (req, res) -> {
			String queryBody = req.body();
			String query = queryBody.split("=")[1];
			query = query.replace("+", " ");
			
			return ResultController.serveResult(query);
		});
	}
	
//	private static String buildPage(String filename) {
//		StringBuilder contentBuilder = new StringBuilder();
//		try {
//		    BufferedReader in = new BufferedReader(new FileReader(filename));
//		    String str;
//		    while ((str = in.readLine()) != null) {
//		        contentBuilder.append(str);
//		    }
//		    in.close();
//		} catch (IOException e) {
//		}
//		return contentBuilder.toString();
//	}

}
