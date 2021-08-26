package main;

import java.util.Scanner;

import HanGilYong.TestHan;
import Lee.TestLee;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		TestHan han = new TestHan();
		TestLee lee = new TestLee();
		while(true) {
			System.out.println("1. 한길용 2. 이진원 3. 진동수 4. 이창훈 5. 이동호");
			num = input.nextInt();
			switch(num) {
			case 1 : 
				han.testhanfunc();
				break;
			case 2 : 	lee.testleefunc();
				break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			}
		}
	}
}
