package com.juaracoding.posttest28;

public class SoalData {

		public static void Trailer(String n) {
			String tagT2 = ":T2:";
			String fulltrailer = n;
			String trailer1=fulltrailer.substring(0, 18);
			String trailer2=fulltrailer.substring(18, 36);
			String trailer3=fulltrailer.substring(36, 54);
			String trailer4=fulltrailer.substring(54, 72);
			String trailer5=fulltrailer.substring(72, 90);
			StringBuilder full = new StringBuilder();
			full.append(tagT2).append(trailer4).append(trailer5).append(trailer1).append(trailer2).append(trailer3);
			System.out.println(full);
		}
}
