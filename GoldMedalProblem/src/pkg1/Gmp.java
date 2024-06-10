package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gmp {
	public static void main(String[] args)throws FileNotFoundException {
		ArrayList<Integer> englishMarks = new ArrayList<>();
		ArrayList<String> subjects = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		int engtopmark = 0;
		int mathtopmark;
		ArrayList<String> englishTops = new ArrayList<>();
		File f1 = new File("data.txt");
		Scanner sc1 = new Scanner(f1);
		while(sc1.hasNextLine()) {
			String line = sc1.nextLine();
			String[] li1 = line.split(",");
			String[] li2 = li1[3].split(":");
			subjects.add(li2[0]);
			englishMarks.add(Integer.parseInt(li2[1]));
			names.add(li1[0]);
		}
		
		for(int i = 0; i<englishMarks.size(); i++) {
			if(englishMarks.get(i)>engtopmark) {
				engtopmark = englishMarks.get(i);	
			}
		}
		
		for(int i=0; i<names.size(); i++) {
			if(englishMarks.get(i) == engtopmark) {
				englishTops.add(names.get(i));				
			}
		}
		
		System.out.println(englishTops+" are the toppers in "+subjects.get(0)+" with marks "+String.valueOf(engtopmark));
	}
}
