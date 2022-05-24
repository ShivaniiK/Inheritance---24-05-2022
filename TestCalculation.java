package com;              //singleInheritance

public class TestCalculation {

	public static void main(String[] args) {
		
		int intad=5, intbs=2;
		Calculation objCalculation = new Calculation();
		//objCalculationInheritance.calculation();
		objCalculation.multiplication(intad, intbs);
		objCalculation.addition(intad, intbs);
		objCalculation.subtraction(intad, intbs);
		}
	}


