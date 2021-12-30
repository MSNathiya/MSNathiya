package com.Constructor;

public class Constructor_types {
    public Constructor_types() {
	    System.out.println("***EMPLOYEE DETAILS***");
	    System.out.println("-----------------------");
	    System.out.println("Default Constructor");
	 }
	public Constructor_types(String P) {
		System.out.println("NAME:"+P);
		}
	public Constructor_types(int Q) {
		System.out.println("Expected monthly salary:"+Q);
	}
	public Constructor_types(float R) {
		System.out.println( "Per Annum Amount in Lakhs:"+R);
	}
	
   public Constructor_types(long S) {
	    System.out.println("Contact number:"+S);
   }
  
  public static void main(String[] args) {
	  new Constructor_types();
	  new Constructor_types("NATHIYA M");
	  new Constructor_types(50000);
	  new Constructor_types(6.0f);
	  new Constructor_types(8508698032l);
	   
      
}
			}
				