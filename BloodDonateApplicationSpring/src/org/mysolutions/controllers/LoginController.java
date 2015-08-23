/**
 * 
 */
package org.mysolutions.controllers;

import org.mysolutions.persistent.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author MADHAV
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping
	public ModelAndView renderLogin(ModelMap map) {
		
		map.put("users",new Users());
		map.put("activTab", "Login");
		
		ModelAndView mav = new ModelAndView("login",map);
		return mav;
	}
	@RequestMapping("/renderRegister")
	public ModelAndView renderRegister(ModelMap map) {
		
		map.put("users",new Users());
		map.put("activTab", "register");
		
		ModelAndView mav = new ModelAndView("login",map);
		return mav;
	}
}
