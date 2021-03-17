package latihan2;

import java.util.Scanner;

public class latihanbilanganprima {

public static void main (String[] args) {
	/*Scanner scan = new Scanner (System.in);
	System.out.println("Masuk Angka :");
	int nilai = scan.nextInt();*/
	
	/*if (nilai>1) {
		if ((nilai==2)|(nilai==3)|(nilai==5)) {
			System.out.println("Ini bilangan prima");
		}else {
				if ((nilai%2==0)|(nilai%3==0)|(nilai%5==0)) {
					System.out.println("Ini Bukan Bilangan Prima");
				}else {
					System.out.println("Ini bilangan prima");
				}
					
		}		
	}else {
		System.out.println("Angka harus lebih besar dari 1");
	}*/
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	/*Scanner scan = new Scanner (System.in);
	System.out.println("Masuk Angka :");
	int nilai = scan.nextInt();
	int counterbagi = 0 ;
	for (int x = 1; x <= nilai ; x++) {
		if(nilai % x == 0) {
			counterbagi++;
		}
	}
	if(counterbagi ==2) {
		System.out.println("Bilangan Prima");
	}else {
		System.out.println("Bukan Bilangan Prima");
	}*/
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   /* Scanner scan = new Scanner(System.in);
    System.out.println("Masukan Panjang Bintang yang diinginkan");
    int panjang = scan.nextInt();
    System.out.println("Masukan Lebar yang diinginknan");
    int lebar = scan.nextInt();
    
    for(int x =0; x < lebar;x++) {
    	for (int y=0; y < panjang;y++) {
    		System.out.print("*");
    	}
    	System.out.println("");
    }*/
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  
//	Scanner input = new Scanner (System.in);
//	System.out.print("Masukan Jumlah Baris =");
//	int n= input.nextInt();
//	System.out.print("Masukan Jumlah Kolom =");
//	int m= input.nextInt();
//	int[] [] nilai = new int[n] [m];
//	
//	for (int i=0;i<n;i++) {
//		for(int j=0;j<m;j++) {
//			System.out.print("Masukan Data ke["+i+"]["+j+"]=");
//			nilai[i][j]=input.nextInt();
//		}
//		System.out.println();
//	}
//   for(int i=0;i<n;i++) {
//	   for(int j=0;j<m;j++) {
//		   System.out.print(nilai[i][j]+" ");
//	   }
//	   System.out.println();
//   }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//	Scanner input = new Scanner (System.in);
//	System.out.println("Masukan nama binatang=");
//	String jawab = input.next().toLowerCase();
//	
//	switch (jawab) {
//	case "tikus":
//	case "kucing":
//	case "mancik":
//	System.out.println("ini binantang kaki empat");
//	break;
//	case "ikan":
//	case "paus":
//	case "hius":
//	System.out.println("Binantan di air");
//	break;
//	default:
//	System.out.println("Binantang apa itu?");
//	
//		
//	
//==================================================================================================
	Scanner scan = new Scanner(System.in);
	System.out.println("Masukan tinggi segitiga");
	int panjang = scan.nextInt();
	
	for (int x = 0; x < panjang; x++) {

		int dummyKiri = panjang - x;
		int dummyKanan = panjang + x;

		for (int y = 0; y <= panjang * 2; y++) {

			if (y == panjang) {
			
				System.out.print("!");
			} else {

				if (y < dummyKiri) {
					
					System.out.print(" ");

				} else {
					if (y > panjang && y > dummyKanan) {
						
						System.out.print(" ");
						
					} else {
						
						System.out.print("*");
					}
				}
			}
		}
		System.out.println("");

  }
	
}
}
	
			
			
	


	

