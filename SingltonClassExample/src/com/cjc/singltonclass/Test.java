package com.cjc.singltonclass;

public class Test {

	public static void main(String[] args) {
		
		
		
	SingletonExample se=	SingletonExample.getSingletonExample();
		
	System.out.println(se);
	
	System.out.println(SingletonExample.getSingletonExample()+"-----1");
	
	
	
	}
	
}
