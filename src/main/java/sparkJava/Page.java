package sparkJava;

import java.util.List;

public class Page {
	
	public static String indexString() {
		return "<!DOCTYPE html>" + 
				"<html>" + 
				"<head>" + 
				"<h4>Please input your query</h4>" + 
				"</head>" + 
				"<body>" +
				"<form method=\"POST\" action=\"/result\">" +
				"<input type=\"text\" name=\"query\">" +
				"<br>" +
				"<input type=\"submit\" value=\"Submit\">" +
				"</form>" +
				"</body>" +
				"</html>";
	}
	
	public static String resultString(List<String> resultList) {
		String output = "<!DOCTYPE html>" +
				"<h4> Results </h4>" +
				"<form method=\"GET\" action=\"/\">" +
				"<input type=\"submit\" value=\"Back to Home\">" + 
				"</form>" + 
				"<div>" + 
				"<table>";
		
		for (String result : resultList) {
			output = output + "<tr>" + result + "</tr><br><hr>";
		}
		
		output = output + "</table>" + "</div>";
		
		return output;
	}

}
