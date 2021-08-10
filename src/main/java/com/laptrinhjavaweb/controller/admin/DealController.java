package com.laptrinhjavaweb.controller.admin;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dto.DealOutDTO;
import com.laptrinhjavaweb.service.IDealOutservice;


@Controller(value = "dealControllerOfAdmin")
public class DealController {
	@Autowired 
	private IDealOutservice deal;

	
	
	@RequestMapping(value = "/quan-tri/deal", method = RequestMethod.GET)
	public ModelAndView homePage(@RequestParam("id") int id, HttpServletRequest request) {
		
		
		DealOutDTO model = new DealOutDTO();
		
		ModelAndView mav = new ModelAndView("admin/deal/ShowDealOut");
		
	
		model=deal.findById(id);
	
		mav.addObject("model", model);
		
		
	
		return mav;
	}
}
