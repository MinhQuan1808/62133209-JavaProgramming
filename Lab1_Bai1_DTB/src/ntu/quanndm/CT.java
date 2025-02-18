package ntu.quanndm;

import java.util.Scanner;

public class CT {
	public static void main(String[] args) {
		System.out.println("LAB1_BAI1: DIEM TRUNG BINH");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho va ten: ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhap diem trung binh: ");
		double dTB = scanner.nextDouble();
		System.out.printf("%s %f diem",hoTen,dTB);
	}
}
