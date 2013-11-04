package org.geymer.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext(
        "beans.xml");
	String beans[]=new String[]{"userSimple","userConstructor","role","userArgRef","session","userSingleton","userDestroyInit","userWithProperties","userWithInnerProperties","userInnerWithConstructor","userWithProperties2","collection","userWithNull","userWithSpEL","roleSpEL","userWithWireByName","autowireByType","autowireByConstructor","userWithWireByDefault","sessionManager","userAnnotation"};
	
for(int i=0;i<beans.length;i++)
	System.out.println(beans[i]+"\t"+ctx.getBean(beans[i]));
	
}
}
