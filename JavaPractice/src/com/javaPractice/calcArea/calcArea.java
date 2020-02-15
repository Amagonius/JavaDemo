package com.javaPractice.calcArea;
import java.util.Scanner;

public class calcArea{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double radius = scanner.nextDouble();
		double area = 3.14 * radius * radius;
		System.out.println("圆的面积是：" + area);
	}
}