package com.javapapers.jee;

public class AnimalTypeService1 {
	public String animalType(String animal) {
		String animalType = "";
		if ("Cat".equals(animal)) {
			animalType = "Wild";
		} else if ("Rat".equals(animal)) {
			animalType = "Domestic";
		} else {
			animalType = "I don't know!";
		}
		return animalType;
	}
}
