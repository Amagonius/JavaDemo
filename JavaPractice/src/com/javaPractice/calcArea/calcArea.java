package com.javaPractice.calcArea;
import java.util.Scanner;

public class calcArea{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double radius = scanner.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("Բ������ǣ�" + area);
	}
}