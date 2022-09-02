package com.juaracoding.posttest28;

public class PostTest28 {

	public static void main(String[] args) {

		BizzBuzz buzz = new BizzBuzz();
		System.out.println("-------SOAL 1--------");
		buzz.Bizz(100);

		System.out.println("\n-------SOAL 2--------");
		SegitigaTerbalik segitigaTerbalik = new SegitigaTerbalik();
		segitigaTerbalik.Segitiga(10);

		
		System.out.println("\n-------SOAL 3--------");
		SoalData soal = new SoalData();
		String data1 = "50AL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
		String data2 = "SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY .DT";
		String data3 = "50AL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
		soal.Trailer(data1);
		soal.Trailer(data2);
		soal.Trailer(data3);
		
 
	}

}
