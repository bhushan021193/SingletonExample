package com.cjc.singltonclass;

final public class SingletonExample {

	private SingletonExample() {//dont allow any class to make object from outside

	}

	private static SingletonExample se;//to get memory only once

	static SingletonExample getSingletonExample() { //allow global access

		
		
		if (se == null) {//create instance if not created
			System.out.println("in if");
			
			//actual insatnce will create here
			se = new SingletonExample();
		}
		return se;
	}

}
