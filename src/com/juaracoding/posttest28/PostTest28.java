package com.juaracoding.posttest28;

public class PostTest28 {

	public static void main(String[] args) {

		BizzBuzz buzz = new BizzBuzz();
		System.out.println("-------SOAL 1--------");
		buzz.Bizz(100);

//		System.out.println("-------SOAL 2--------");
//      for (int i = 5; i >= 1; i--){
//          int n = 1;
//          for (int j = i; j<10; j++)
//          {
//	            if(j%2!=0) {
//	            	System.out.print(j);
//	            }else {
//	            	System.out.print("_");
//	            }
//          }
//        
//          System.out.println();
//      }

		
		System.out.println("-------SOAL 3--------");
		SoalData soal = new SoalData();
		String data = "50AL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY .DT";
		soal.Trailer(data);
		
 
	}

}
