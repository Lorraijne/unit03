package by.htp.unit03.main;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		int value = 1;
		int cash = 1;
		double money = 1;
		double sum = 1;

	
		Scanner sc = new Scanner(System.in);
		System.out.print("Выберите КОНВЕРТИРУЕМУЮ валюту: 1 - BYN, 2 - USD, 3 - EUR ");

		while (sc.hasNextInt() == false) {
			String str;
			str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно 1, 2 или 3");
			System.out.print("Выберите КОНВЕРТИРУЕМУЮ валюту: 1 - BYN, 2 - USD, 3 - EUR ");
			
		}
		value = sc.nextInt();

		System.out.print("Введите размер суммы ");
		Scanner sb = new Scanner(System.in);
		money = sb.nextDouble();

		System.out.print("Выберите валюту В КОТОРУЮ вы хотите конвертировать деньги: 1 - BYN, 2 - USD, 3 - EUR ");
		Scanner sa = new Scanner(System.in);
		cash = sa.nextInt();

		switch (value) {
		case 1:
			if (cash == 2) {
				sum = money / 2.4506;
			} else if (cash == 3) {
				sum = money / 2.6832;
			} else {
				System.out.println("И зачем?");
				sum = money;
			}
			break;
		case 2:
			if (cash == 1) {
				sum = money * 2.4506;
			} else if (cash == 3) {
				sum = money * 0.9133;
			} else {
				System.out.println("И зачем?");
				sum = money;
			}
			break;
		case 3:
			if (cash == 1) {
				sum = money * 2.4506;
			} else if (cash == 2) {
				sum = money / 0.9133;
			} else {
				System.out.println("И зачем?");
				sum = money;
			}
			break;
		}

		System.out.println("Итого " + sum);

	}
}
// задание модуля 3 зачтено
