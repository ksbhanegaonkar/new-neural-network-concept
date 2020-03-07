package com.neuralnetwork.model;

public class Cell {
	private String input;
	private String output;

	
	public String process(String input) {
		this.input = input;
		output = doProcess(input);
		return output;
	}


	private String doProcess(String input) {
		return input;
	}
	
	
}
