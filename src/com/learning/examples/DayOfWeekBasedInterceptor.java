package com.learning.examples;

import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest sreq, HttpServletResponse sres, Object handler) throws Exception {
		Calendar cl = Calendar.getInstance();
		int day = cl.get(Calendar.DAY_OF_WEEK);
		if(day == 7) {
			sres.getWriter().write("On Saturday Application remains down");
			return false;
		}
		return true;
	}
}