package com.lamda.workspace;

public class LamdaDemo {

	public static void main(String[] args) {
  WebPage w1 = (String value) -> {System.out.println("data"+value);};
	
	


WebPage w2 = (int a,int b)-> {
	System.out.println("raja"+ a+b);
};


w2.header("subbu");

   w1.header("ramu");
	}
	

}
