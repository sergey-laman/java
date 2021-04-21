/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Кофе-машина");
 
		int moneyAmount = 50;
 
		System.out.println("Вы внесли " + moneyAmount + " руб.");
 
		int cappucinoPrice = 150;
		int espressoPrice = 80;
		int teaPrice = 50;
        int waterPrice = 10;
		int milkPrice = 7;
 
		boolean canBuySomething = false;
 
		if(moneyAmount >= cappucinoPrice) {
			System.out.println("Вы можете купить капучино");
			canBuySomething = true;
		}
 
		if(moneyAmount >= espressoPrice) {
			System.out.println("Вы можете купить эспрессо");
			canBuySomething = true;
		}
 
		if(moneyAmount >= teaPrice) {
			System.out.println("Вы можете купить чай");
			canBuySomething = true;
		}
		
        if(moneyAmount >= waterPrice) {
			System.out.println("Вы можете купить воду");
			canBuySomething = true; 
        } 
 
 
		if(moneyAmount >= milkPrice) {
			System.out.println("Вы можете купить молоко");
			canBuySomething = true;
		}
 
		if(canBuySomething == false) {
			System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
		}	
	}
}