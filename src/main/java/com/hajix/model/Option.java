package com.hajix.model;

import java.util.UUID;

public class Option {

	private UUID id;
	private String text;
	private double value;
	
	public Option() { }

	public Option(UUID id, String text, double value) {
		this.id = id;
		this.text = text;
		this.value = value;
	}
	
	public static Option createOption(String text, double value) {
		return new Option(UUID.randomUUID(), text, value);
	}

	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
