package org.seleco.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@PostMapping("totalNumberOfTeams")
	public ModelAndView enterTeamsName(@RequestParam("totalTeamsNumber") int totalTeamsNumber) {
		ModelAndView modelAndView = new ModelAndView("enterTeamNames");
		modelAndView.addObject("totalTeamsNumber", totalTeamsNumber);
		return modelAndView;
	}

	@PostMapping("teamsNameList")
	public ModelAndView displayTeams(@RequestParam("teamName") List<String> teamName) {
		ModelAndView modelAndView = new ModelAndView("displayTeamName");
		RandomMatch randomMatch = new RandomMatch(teamName);
		List<String> finalList=randomMatch.teamLogic();
		modelAndView.addObject("finalList", finalList);
		return modelAndView;

	}
}
