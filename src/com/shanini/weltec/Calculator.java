package com.shanini.weltec;

public class Calculator implements Icalculator {

	@Override
	public double add(double... number) {
		double total=0;
		for(double num: number){
			total += num;
			
		}
		return total;
	}

	@Override
	public double multiply(double... number) {
		double total=1;
		for(double num: number){
			total=total*num;
			
		}
		return total;
	}

	@Override
	public double substract(double number1, double number2) {
		// TODO Auto-generated method stub
		return number1-number2;
	}

}
