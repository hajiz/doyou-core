package com.hajix.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QuestionnaireTest {
	
	private static final String TITLE = "test title";
	private static final String QUESTION = "question";
	private static final String OPTION1 = "option1";
	private static final String OPTION2 = "option2";

	@Test
	public void shouldCreateQuestionnaireAndAddQuestions() {
		Questionnaire questionnaire = Questionnaire.emptyQuestionnaire(TITLE);
		
		Question question = Question.emptyQuestion(QUESTION);
		
		question.addOption(Option.createOption(OPTION1, 0.8));
		question.addOption(Option.createOption(OPTION2, 0.2));
		
		questionnaire.addQuestion(question);
		
		assertEquals(1, questionnaire.getQuestions().size());
		Question extractedQuestion = questionnaire.getQuestions().get(0);
		assertEquals(2, extractedQuestion.getOptions().size());
		assertEquals(OPTION1, extractedQuestion.getOptions().get(0).getText());
		assertEquals(0.8, extractedQuestion.getOptions().get(0).getValue(), 0);
		assertEquals(OPTION2, extractedQuestion.getOptions().get(1).getText());
		assertEquals(0.2, extractedQuestion.getOptions().get(1).getValue(), 0);
	}

}
