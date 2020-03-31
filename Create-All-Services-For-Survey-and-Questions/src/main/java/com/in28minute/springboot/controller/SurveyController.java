package com.in28minute.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minute.springboot.model.Question;
import com.in28minute.springboot.service.SurveyService;

@RestController
public class SurveyController {

	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/surveys/{surveyId}")
	public List<Question> retrieveQuestionsForSurvey(String surveyId){
		
		
		return surveyService.retrieveQuestions(surveyId);
		
	}
}
