package com.hemebiotech.analytics;

import java.util.TreeMap;

public class AnalyticsCounter {
	
	//Paths implementation for the input and output files
	
	private static String SYMPTOMS_PATH = "symptoms.txt";
	private static String SYMPTOMS_RESULT ="result.out";
	
	public static void main(String args[]) throws Exception {
		
		//Instantiation of created classes and call of the methods
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(SYMPTOMS_PATH);
		
		//System.out.println(reader.GetSymptoms());
		
		CountAndClassifySymptoms counter = new CountAndClassifySymptoms(reader.GetSymptoms());
		
		TreeMap<String,Integer> resultMap = counter.countOrderedSymptoms();
		
		//System.out.println(resultMap);
		
		WrittenResult writer = new WrittenResult (resultMap, SYMPTOMS_RESULT);
		
		writer.writenLastList();
	}
}
