package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountAndClassifySymptoms 
{
	//Attribute's declaration
	
	public List<String> symptoms; 
	
	//Assignment
	
	public CountAndClassifySymptoms (List<String> symptomRead)
	{
		this.symptoms = symptomRead; 
		
	}
	
	//Treemap method to carry out the entries counting and classification
	
	public TreeMap<String, Integer> countOrderedSymptoms()
	{	
		TreeMap<String, Integer> counterMap = new TreeMap<String, Integer>();
		
		for(String symptom : symptoms)
		{	
			Integer count=counterMap.get(symptom);
			
			if (count != null) {
				count=count + 1;
			} else {
				count=1;
			}
			//System.out.println(symptom);
			
			counterMap.put(symptom, count);
		}
	
		return counterMap;
		
	}
}
