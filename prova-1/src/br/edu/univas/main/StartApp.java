package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.factory.AnimalsFactory;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.vo.Animaleat;
import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;
import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		String animalName = scanner.next();
		
		AnimalsFactory animalFactory = FactoryProvider.getFactory(animalName);
		
		Animaleat animalEat = animalFactory.createAnimal();
		animalEat.eat();
	
	}
}
