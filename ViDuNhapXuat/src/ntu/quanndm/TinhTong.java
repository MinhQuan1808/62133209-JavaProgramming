package ntu.quanndm;

import java.util.Scanner;

public class TinhTong {
	public static void main(String[] args) {
		//In dong tieu de
		System.out.println("VI DU TINH TONG");
		//Chuan bi cho viec nhap
		Scanner banPhim = new Scanner(System.in);
		//Huong dan nhap
		System.out.println("Nhap A: ");
		double a = banPhim.nextDouble();
		System.out.println("Nhap B: ");
		double b = banPhim.nextDouble();
		//Xuat tong
		double tong = a + b;
		System.out.print("Tong la: ");
		System.out.print(tong);
	}
}
