package com.neuralnetwork.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Body {
	Queue<Transmitter> commChannel = new LinkedList<>();
	Map<String, Organ> body = new HashMap<>();

	public Map<String, Organ> getBody() {
		return body;
	}

	public Queue<Transmitter> getCommChannel() {
		return commChannel;
	}

	
	public Organ createOrgan(String name) {
		Organ o = new Organ(name, commChannel);
		body.put(name, o);
		return o;
	}
		
	
	
}
