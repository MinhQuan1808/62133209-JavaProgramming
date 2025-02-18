package ntu.quanndm;

import java.util.Scanner;

public class CT {
	public static void main(String[] args) {
		System.out.println("LAB1_BAI2: TINH CHU VI DIEN TICH");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh 1: ");
		double canh1 = scanner.nextDouble();
		System.out.println("Nhap canh 2: ");
		double canh2 = scanner.nextDouble();
		double chuVi = (canh1 + canh2)*2;
		double dienTich = canh1*canh2;
		double canhNho = Math.min(canh1, canh2);
		System.out.printf("Chu vi = %f \n",chuVi);
		System.out.printf("Dien tich = %f \n",dienTich);
		System.out.printf("Canh nho = %f",canhNho);
	}
}
