package com.neuralnetwork.model;

import java.util.Queue;

public class Organ {
		private String name;
		private Queue<Transmitter> commChannel;

		public Organ(String name, Queue<Transmitter> commChannel) {
			this.name = name;
			this.commChannel = commChannel;
		}
		
		
}
