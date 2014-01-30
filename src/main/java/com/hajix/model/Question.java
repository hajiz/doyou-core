package com.hajix.model;

import java.util.List;
import java.util.UUID;

import com.google.common.collect.Lists;

public class Question {

	private UUID id;
	private String text;
	private List<Option> options;
	
	public Question() { }

	public Question(UUID id, String text, List<Option> options) {
		this.id = id;
		this.text = text;
		this.options = options;
	}
	
	public static Question emptyQuestion(String text) {
		return new Question(UUID.randomUUID(), text, Lists.<Option>newArrayList());
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

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	public void addOption(Option option) {
		options.add(option);
	}
}
