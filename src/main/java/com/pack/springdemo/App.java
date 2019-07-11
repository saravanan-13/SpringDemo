package com.pack.springdemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Resource resource = new ClassPathResource("beans.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("-------------");
    	System.out.println(" MAN ");
    	System.out.println(" WOMAN ");
    	System.out.println("-------------");
    	System.out.println("Enter choice :- ");
    	String op = sc.next();
        Human obj = (Human) factory.getBean(op);
        
        System.out.println(obj);
        sc.close();
    }
}
