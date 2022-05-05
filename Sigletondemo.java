package com.example.singleton;

public class Sigletondemo {

	//Lazy loading
	private static Sigletondemo instance=null;
	private Sigletondemo() {
		
	}
	//Double checking
	public static Sigletondemo getInstance() {
		if(instance==null) {
			synchronized (Sigletondemo.class) {
				if(instance==null) {
					instance = new Sigletondemo();
				}
				
			}
		}
		return instance;
	}
	
	
	//Bilpugh impelementation
	public static class Singletondemohelper{
		private static Sigletondemo instance=new Sigletondemo();
		
	}
	
	public static void main(String[] args) {
		Sigletondemo sd=Sigletondemo.getInstance();
		Sigletondemo sd1=Sigletondemo.getInstance();
		System.out.println(sd.hashCode());
		System.out.println(sd1.hashCode());
		
		System.out.println(Singletondemohelper.instance.hashCode());
		System.out.println(Singletondemohelper.instance.hashCode());
	}
}
