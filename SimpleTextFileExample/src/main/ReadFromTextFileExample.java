package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTextFileExample {

	public static void main(String[] args) {
		
		// lucrul cu sistemul de fiesire File
		
		File file = new File("data/person.txt");
		
		// vei scana din fisierul indicat
		try {
			Scanner in = new Scanner(file);
			String fname, lname;
			int age;
			
			fname = in.next();
			lname = in.next();
			age   = in.nextInt();
			
			System.out.println( fname + lname + age );
			
		} catch (FileNotFoundException e) {
			
			System.out.println("NU POT CITI!");
		}
		
		
		
	}

}

