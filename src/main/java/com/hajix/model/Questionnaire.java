package com.hajix.model;

import java.util.List;
import java.util.UUID;

import com.google.common.collect.Lists;

public class Questionnaire {

	private UUID id;
	private String title;
	private List<Question> questions;
	
	public Questionnaire() { }

	public Questionnaire(UUID id, String title, List<Question> questions) {
		this.id = id;
		this.title = title;
		this.questions = questions;
	}
	
	public static Questionnaire emptyQuestionnaire(String title) {
		return new Questionnaire(UUID.randomUUID(), title, Lists.<Question>newArrayList());
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public void addQuestion(Question question) {
		questions.add(question);
	}
}
