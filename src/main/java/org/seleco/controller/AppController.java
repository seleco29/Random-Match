package org.seleco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@GetMapping("totalTeamsForm")
	public ModelAndView enterTotalTeams(@RequestParam("totalTeams") String totalTeams) {
		ModelAndView modelAndView = new ModelAndView("enterTeamNames");
		modelAndView.addObject("totalTeams", totalTeams);
		return modelAndView;
	}

	@GetMapping("teamNameList")
	public ModelAndView displayTeams(@RequestParam("teamName") String teamName) {
		ModelAndView modelAndView = new ModelAndView("displayTeamName");
		modelAndView.addObject("teamName", teamName);
		return modelAndView;

	}
}
