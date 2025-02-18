package ntu.quanndm;

import java.util.Scanner;

public class CT {
	public static void main(String[] args) {
		System.out.println("LAB1_BAI4: TINH CAN DELTA CUA PHUONG TRINH BAC 2");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhap canh b: ");
		double b = scanner.nextDouble();
		System.out.println("Nhap canh c: ");
		double c = scanner.nextDouble();
		double delta = Math.pow(b, 2) - 4*a*c;
		double canDelta = Math.sqrt(delta);
		System.out.printf("Can Delta = %f",canDelta);
	}
}
