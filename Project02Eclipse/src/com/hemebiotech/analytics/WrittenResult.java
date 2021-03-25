package com.hemebiotech.analytics;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.io.IOException;

public class WrittenResult {

	//Attribute's declaration
	
	private String filepath;
	
	public Map<String, Integer> map;
		
	//Assignment
	
	public WrittenResult(Map<String, Integer> myMap, String filepath) {
		this.map=myMap;
		this.filepath=filepath;
	}
	
	//BufferedWriter method to carry out the implementation of the result list in the output file
	
	public void writenLastList() throws IOException {
		BufferedWriter writer = new BufferedWriter (new FileWriter(filepath));
		
		for (Entry<String, Integer> entry: map.entrySet()) {
			writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
			//System.out.println(entry.getKey() + ":" + entry.getValue() + "\n");
		}
		writer.close();
	}
}
		
