package com.controller;

public class run {
public static int run2(String num1,String num2) {
	int sum=300;
	try {
	sum=Integer.parseInt(num1)+ Integer.parseInt(num2);}
	catch(Exception e) {
		e.printStackTrace();
	}
	return sum;
}
}
