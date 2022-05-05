package com.example.factory;

public class Factoryclient {

	public static void main(String[] args) {
		Bird bird=Birdfactory.getBird("Sparrow");
		bird.fly();
	}
}
