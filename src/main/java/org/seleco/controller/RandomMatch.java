package org.seleco.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.seleco.entity.TeamName;

public class RandomMatch {
	List<String> recivedList = new LinkedList<>();

	public RandomMatch(List<String> recivedList) {
		this.recivedList = recivedList;
	}

	List<TeamName> sortingList = new LinkedList<TeamName>();
	List<String> finalList = new LinkedList<>();

	public List<String> teamLogic() {

		Random random = new Random();

		while (recivedList.size() != 0) {
			int randomValue = random.nextInt(recivedList.size());
			sortingList.add(new TeamName(recivedList.get(randomValue)));
			recivedList.remove(recivedList.get(randomValue));
		}

		if (sortingList.size() % 2 == 0) {
			for (int i = 0; i < sortingList.size(); i = i + 2) {
				finalList.add(sortingList.get(i).getTeamName() + " Vs " + sortingList.get(i + 1).getTeamName());
			}
		} else {
			int j = 0;
			for (int i = 0; i < sortingList.size(); i = j) {
				if (j < sortingList.size() - 1) {
					j = j + 2;
					finalList.add(sortingList.get(i).getTeamName() + " Vs " + sortingList.get(i + 1).getTeamName());
				} else {
					finalList.add(sortingList.get(i).getTeamName() + " gets walk over!");
					break;
				}

			}
		}
		return finalList;
	}

}
