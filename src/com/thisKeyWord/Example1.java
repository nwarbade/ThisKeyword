package com.thisKeyWord;

public class Example1 {
	
	int a = 23;            // global variable
	int b = 32;             // global variable
	
	public void getMethod () {
		
		int c = 12;              //local variable
		int d = 34;           //local variable
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
		
		public void getMethod1 () {
			
			int e = 45;
			int f = 43;
			
			System.out.println(e);
			System.out.println(f);
			System.out.println(this.a);
			System.out.println(this.b);
		
	}
		public static void main(String[] args) {
			
			Example1 h = new Example1();
			
			h.getMethod();
			h.getMethod1();
			
		}

}
