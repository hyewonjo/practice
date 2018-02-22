package com.jstl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
@RestController
public class HelloController {

	String[] names = {"kim","lee"};
	String[] mails = {"kim@tuuyano.com", "lee@flower"};
	
	@RequestMapping("/{id}")
	public DataObjectTest index(@PathVariable int id) {
		return new DataObjectTest(id, names[id], mails[id]);
	}
	
}
*/

@Controller
public class HelloController {

	/*
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg", "폼을 전송해주세요.");
		return mav;
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView send(
			@RequestParam(value="check1", required=false) boolean check1,
			@RequestParam(value="radio1", required=false) String radio1,
			@RequestParam(value="select1", required=false) String select1,
			@RequestParam(value="select2", required=false) String[] select2,
			ModelAndView mav) {
		
		String res = "";
		try {
			res = "check:" + check1 + " radio:" + radio1 + " select:" + select1 + 
					"\nselect2:" ;
		}catch(NullPointerException e) {}
		try {
			res += select2[0];
			for(int i=1; i<select2.length; i++) {
				res += ", " + select2[i];
			}
		}catch(NullPointerException e) {
			res += "null";
		}
		
		mav.setViewName("index");
		mav.addObject("msg", res);
		return mav;
	}
	*/
	
	/*
	@RequestMapping(value="/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("redirect");
		return mav;
	}
	
	@RequestMapping("/other")
	public String other() {
		return "redirect:/";
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("forward:/");
	}*/
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index1");
		return mav;
	}
}