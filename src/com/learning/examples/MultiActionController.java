package com.learning.examples;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/math-ops") /* identifies this class to class */
public class MultiActionController {

	@RequestMapping("/square/{n}") /* Decides whether this method should be invoked or not*/
	protected ModelAndView mySqr(@PathVariable("n") int m) {
		/* "@PathVariable("n") int m" is binding the parameter passed in url as name n to m */
		ModelAndView mNv = new ModelAndView("hello");
		mNv.addObject("key", m * m);
		return mNv;
	}
	
	@RequestMapping("/sqrt/{n}") /* Decides whether this method should be invoked or not*/
	protected ModelAndView mySqrt(@PathVariable("n") int m) {
		ModelAndView mNv = new ModelAndView("hello");
		mNv.addObject("key", Math.sqrt(m));
		return mNv;
	}
	
	@RequestMapping("/sum/{a}/{b}/{c}") /* long list of parameters*/
	/*push them all in java map and avoid typing each*/
	protected ModelAndView mySum(@PathVariable Map<String, String> pathVars) {
		ModelAndView mNv = new ModelAndView("hello");
		double result;
		int a = Integer.parseInt(pathVars.get("a"));
		int b = Integer.parseInt(pathVars.get("b"));
		int c = Integer.parseInt(pathVars.get("c"));
		result = a + b + c;
		mNv.addObject("key", result);
		return mNv;
	}
}
