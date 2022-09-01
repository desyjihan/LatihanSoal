package com.juaracoding.posttest28;

public class BizzBuzz {
	
	public static void Bizz(int n) {
		for(int i=1; i<=n; i++) {
			if(i%3 == 0 && i%5 ==0) {
				System.out.println("BIZZBUZZ " + i);
			}else if(i%3==0) {
				System.out.println("BIZZ " + i);
			}else if(i%5==0) {
				System.out.println("BUZZ " + i);
			}
		}
	}
}
