package com.learning.examples;
 

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.learning.entities.Student;
@Controller
@RequestMapping(value="student-registration")
public class ModelAttributeExample {
	@InitBinder
	public void initBinder(WebDataBinder wdb) {
		wdb.setDisallowedFields(new String[] {"mobile"});
	}
	
	@RequestMapping(value="admission-form",  method=RequestMethod.GET)
	protected ModelAndView getAdmissionForm() {
		ModelAndView mNv = new ModelAndView("ModelAttribute/AdmissionForm");
		mNv.addObject("key", "Welcome Back!!!");
		return mNv;
	}
	@ModelAttribute
	public void AddHeader(Model model) {
		model.addAttribute("heading", "Spring Learnings");
	}
	//@RequestParam("name") String name, @RequestParam("hobby") String hobby
	@RequestMapping(value="admission-form", method=RequestMethod.POST)
	protected ModelAndView postAdmissionForm(@ModelAttribute("student") Student std, BindingResult br) {
		if(br.hasErrors()) {
			ModelAndView mNv = new ModelAndView("ModelAttribute/AdmissionForm");
			return mNv;
		}
		ModelAndView mNv = new ModelAndView("ModelAttribute/AdmissionSuccess");
		mNv.addObject("key", std);
		return mNv;
	}
}
