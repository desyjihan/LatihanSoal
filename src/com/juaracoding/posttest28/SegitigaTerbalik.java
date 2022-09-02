package com.juaracoding.posttest28;

public class SegitigaTerbalik {
	
	public static void Segitiga(int input) {
	
		int n=input;
		int h =n/2;
		for (int i = 1; i <= h; i++){
			for (int j = i; j<=h; j++)
			{
				if(j%2!=0) {
					System.out.print(j);
				}else {
					System.out.print("_");
				}
			}
			for (int z = h+1; z < n; z++)
				if(z%2!=0) {
					System.out.print(z);
				}else {
					System.out.print("_");
				}
			n--;
			System.out.println();
		}
	}
}
