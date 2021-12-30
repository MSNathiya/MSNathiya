package com.Constructor;
public class ConstructorChaining_Example {
	public ConstructorChaining_Example (){
		this("Microsoft");
	System.out.println("default Constructor");
	}
	public ConstructorChaining_Example (int P){
		this(4258.1245f);
    System.out.println("int value of p is:"+P);
	}	
	public ConstructorChaining_Example (String Q){
		this(39);
	System.out.println("String name of Q is:"+Q);
	}	
	public ConstructorChaining_Example (float R ){
		
	System.out.println("Float value of R is:"+R);
	}
	public static void main(String[] args) {
		new ConstructorChaining_Example();
	}
}