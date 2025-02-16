package ntu.quanndm;

import java.util.Scanner;

public class Lab1_Bai3_TheTich {
	public static void main(String[] args) {
		System.out.println("LAB1_BAI3: TINH THE TICH KHOI LAP PHUONG");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh khoi lap phuong: ");
		double canh = scanner.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.printf("The tich khoi lap phuong = %f",theTich);
	}
}
