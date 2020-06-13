package com.practice;

import net.bytebuddy.implementation.bind.annotation.Super;

public class B extends A {
	
@Override
public int sum() {
	
	
	A a1=new A();

	
	int c=20;
	int sum =c+super.d+super.sum();
	System.out.println(sum);
	return sum;
}
	

	public static void main(String[] args) {
		B s = new B();
		s.sum();
		
		
		
	}

}
