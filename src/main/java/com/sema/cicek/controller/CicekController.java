package com.sema.cicek.controller;

import java.util.Map;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sema.cicek.model.Cicek;
import com.sema.cicek.service.CicekService;

@Controller
@RequestMapping("/cicek")
public class CicekController {

	@Autowired
	private CicekService cicekService;

	@RequestMapping(value = { "/", "/listCicek" })
	public String listCicek(Map<String, Object> map) {

		map.put("cicek", new Cicek());
		map.put("cicekList", cicekService.listCicek());

		return "/cicek/listCicek";
	}

	@RequestMapping("/get/{cicekId}")
	public String getCicek(@PathVariable Long cicekId, Map<String, Object> map) {

		Cicek cicek = cicekService.getCicek(cicekId);

		map.put("cicek", cicek);

		return "/cicek/cicekForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCicek(@ModelAttribute("cicek") Cicek cicek,
			BindingResult result) {

		cicekService.saveCicek(cicek);

		/*
		 * Note that there is no slash "/" right after "redirect:" So, it
		 * redirects to the path relative to the current path
		 */
		return "redirect:listCicek";
	}

	@RequestMapping("/delete/{cicekId}")
	public String deleteCicek(@PathVariable("cicekId") Long id) {

		cicekService.deleteCicek(id);

		
		return "redirect:/cicek/listCicek";
	}

}
