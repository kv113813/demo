package com.javapapers.jee;
//Evaluation of source tree- changes-2
public class AnimalTypeService {
	public String animalType(String animal) {
		String animalType = "";
		if ("Lion".equals(animal)) {
			animalType = "Wild";
		} else if ("Dog".equals(animal)) {
			animalType = "Domestic";
		} else {
			animalType = "I don't know!";
		}
		return animalType;
	}
}
