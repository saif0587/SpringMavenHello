/**
 * 
 */
package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

/**
 * @author Saif
 *
 */


@Controller
public class HelloController {

	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		
		return new ModelAndView("welcome");
	}


}
