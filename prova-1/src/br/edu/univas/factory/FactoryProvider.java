package br.edu.univas.factory;

public class FactoryProvider {
	
	public static AnimalsFactory getFactory(String animalName) {
		
		if (animalName.contains("1")) {
			return new InvertebradosFactory();
			
		} else if (animalName.contains("2")) {
			return new VertebradosFactory();
		}
		
		return null;
	}
}
