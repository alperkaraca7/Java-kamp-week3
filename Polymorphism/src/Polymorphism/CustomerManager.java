package Polymorphism;

import java.lang.System.Logger;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger= logger;
		
	} 
		
	
	
	public void Add() {
		System.out.println("müşteri eklendi");
//		DatabaseLogger databaseLogger = new DatabaseLogger();
//		databaseLogger.Log("log mesajı");
		
		// ilerde log türü değişeceğinden ötürü databaseloger e bağlı kalmamak için 
		//
		
		this.logger.Log("log mesajı :( ");
		
	}

}
