package com.learning.examples;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//public class HelloController extends AbstractController {
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
//		ModelAndView mNv = new ModelAndView("hello.jsp");
//		mNv.addObject("key", "value");
//		return mNv;
//	}
//
//}

/******************************* Annotation based controller ******************************/
@Controller
public class HelloController {

	@RequestMapping("/Welcome")
	protected ModelAndView greeting() {
		ModelAndView mNv = new ModelAndView("hello");
		mNv.addObject("key", "Welcome Back!!!");
		return mNv;
	}

}
