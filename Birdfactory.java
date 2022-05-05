package com.example.factory;

public class Birdfactory {

	
	public static Bird getBird(String birdType){
		 if(birdType.equals("Sparrow")){
			 return new Sparrow();
		 }
			
		 else if(birdType.equals("Eagle")){
			 return new Eagle();
		 }
		else if(birdType.equals("Owl")){
			 return new Owl();
		}
		return null;
	}
}
