package com.journaldev.design.test;

import com.journaldev.design.abstractfactory.ComputerFactory;
import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.model.Computer;

/**
 * Abstract factory 
 * 
 * @see http://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
 *
 */
public class TestAbstractFactory {

   public static void main(String[] args) {
       testAbstractFactory();
   }

   private static void testAbstractFactory() {
       Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
       Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
       System.out.println("AbstractFactory PC Config::"+pc);
       System.out.println("AbstractFactory Server Config::"+server);
   }
}
