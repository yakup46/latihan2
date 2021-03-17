package com.ujianbatch8.ahmadyakup;

import java.util.Scanner;

public class MenggambarDenganJava {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Masukan NO. Yang Anda Pilih [1-6]");
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("      1.Gambar Kotak             ");
		System.out.println("      2.Gambar Tinggi Segitiga   ");
		System.out.println("      3.Gambar Segitiga Terbalik ");
		System.out.println("      4.Gambar Selang Seling     ");
		System.out.println("      5.Gambar Campur            ");
		System.out.println("      6.Gambar Gabung            ");
		System.out.println("+++++++++++++++++++++++++++++++++");
		String jawab = input.next();
		switch (jawab) {
		case"1":
			MenggambarDenganJava.gambarKotak();
		break;
		case"2":
			MenggambarDenganJava.gambarSegitiga();
		break;
		case"3":
			MenggambarDenganJava.gambarSegitigaterbalik();
		break;
		case"4":
			MenggambarDenganJava.gambarSelangseling();
		break;
		case"5":
			MenggambarDenganJava.gambarCampur();
		break;
		case"6":
			MenggambarDenganJava.gabungGambar();
		break;
		default:
			System.out.println("Input Yang anda masukan SALAH,Silahkan Masukan Angka [1-6]");
		}
		
		
		
		
		}
		
	
	
	static void gambarKotak(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan panjang kotak=");
		int jawab = input.nextInt();
		for (int i = 0; i < jawab; i++) {
			for (int j = 0; j < jawab; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
		
	}
	static void gambarSegitiga(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Tinggi Segitiga=");
		int jawab = input.nextInt();
		for (int i = 1; i <= jawab; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
	}
	static void gambarSegitigaterbalik(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Tinggi Segitiga Terbalik=");
		int jawab = input.nextInt();
		for (int i = jawab; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
	}
	static void gambarSelangseling(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Tinggi Segitiga Selang Seling=");
		int jawab = input.nextInt();
		for (int i = jawab; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if (j%2==0) {
					System.out.print("!");
					
				}else
				
			System.out.print("*");
			
			}
		System.out.println("");
		}
	}
	
	static void gambarCampur(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Tinggi Segitiga gambar campur=");
		int jawab = input.nextInt();
		for (int i = 1; i <= jawab; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			for (int j2 = jawab; j2 >= 1; j2--) {
				for (int k = 1; k <= j2; k++) {
				
					System.out.print("#");
				
				
			}break;
			
			}	
			System.out.println("");
		}
	}
	
	static void gabungGambar(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan Tinggi Segitiga gambar campur=");
		int jawab = input.nextInt();
		for (int i = 1; i <= jawab; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			for (int j2 = jawab; j2 >= 1; j2--) {
				for (int k = 1; k <= j2; k++) {
				
					System.out.print("#");
				
				
			}break;
			
			}	
			System.out.println("");
		}
		for (int u = jawab; u >= 1; u--) {
			for (int z = 1; z<= u; z++) {
				if (z%2==0) {
					System.out.print("!");
					
				}else
				
			System.out.print("*");
			
			}
		System.out.println("");
		}
	}
	
	

	

	

}
