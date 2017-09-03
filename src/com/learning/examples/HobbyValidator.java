package com.learning.examples;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	public void initialize(IsValidHobby isValidHobby) {
		
	}
	
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		if(hobby == null) {
			return false;
		}
		if(hobby.matches("swimming|running|hockey|horse riding")) {
			return true;
		}
		return false;
	}
}
