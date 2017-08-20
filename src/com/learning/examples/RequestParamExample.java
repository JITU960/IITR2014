package com.learning.examples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamExample {

	@RequestMapping(value="admissionForm",  method=RequestMethod.GET)
	protected ModelAndView getAdmissionForm() {
		ModelAndView mNv = new ModelAndView("Admission/AdmissionForm");
		mNv.addObject("key", "Welcome Back!!!");
		return mNv;
	}
	@RequestMapping(value="admissionForm", method=RequestMethod.POST)
	protected ModelAndView postAdmissionForm(@RequestParam("name") String name, @RequestParam("hobby") String hobby) {
		ModelAndView mNv = new ModelAndView("Admission/AdmissionSuccess");
		mNv.addObject("key", "Student "+name+ "has hobby"+hobby);
		return mNv;
	}
}
