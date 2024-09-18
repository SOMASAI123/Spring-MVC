package com.modelviewcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
	@RequestMapping("/home")
	public String home(Model model)
	
	{  
		model.addAttribute("name","somasai");
		model.addAttribute("id",20);
		model.addAttribute("f","friends");
		
		List<String>friends=new ArrayList<String>();
		friends.add("sai");
		friends.add("soma");
		friends.add("kumar");
		
		
		return "home";
	}
	

    @RequestMapping("help") 
   public ModelAndView help()
{
	ModelAndView modelview=new ModelAndView();
	
	modelview.addObject("name","somasai");
	modelview.setViewName("help");
	
	return modelview;
}   
    
    
    @RequestMapping("/contact")
    public String contact()
    {
    	return "contact";
    }
    
    
//    @RequestMapping(path="/process",method = RequestMethod.POST)
//     public String process(@RequestParam("email") String email,@RequestParam("password") String password, Model model)
//     
//     {   
//    	System.out.println(email);
//    	System.out.println(password);
//    	
//    	model.addAttribute("email",email);
//    	model.addAttribute("password",password);
//    	 return "success";
//     }
       
    @RequestMapping(path="/process",method = RequestMethod.POST)
    public String process(@ModelAttribute User user,Model model)
    
    {  
    	model.addAttribute(user);
   	    System.out.println(user);
   	    return "success";
    }
}
