package latihan2;

import java.util.Scanner;

public class segitigabintang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tinggi;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga");
		int jawab = input.nextInt();
		for (int i = 1; i <= jawab; i++) {
			for (int j = 1; j >= jawab; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}

	}

}
