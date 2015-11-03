package com.journaldev.design.test;

import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

/**
 * 
 * 
Benefits of Factory Pattern
	Factory pattern provides approach to code for interface rather than implementation.
	Factory pattern removes the instantiation of actual implementation classes from client code, making it more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.
	Factory pattern provides abstraction between implementation and client classes through inheritance.

Factory Pattern Examples in JDK
	java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
	valueOf() method in wrapper classes like Boolean, Integer etc.

 * @see http://www.journaldev.com/1392/factory-design-pattern-in-java
 * 
 *
 */
public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}

}