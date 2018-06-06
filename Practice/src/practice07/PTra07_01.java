package practice07;
/*
 * PTra07_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_01 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言してください


		// ★ 変数arrayの配列を5個の領域で確保してください
		

		// ★ 変数arrayにそれぞれ、[1,4,7,10,13] を代入してください


		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		for(int i=0;i<= 4;i++){
			for(int j=1; j<=i; j++){
				System.out.print("■");
			}
				for(int j=1; j<=5-i; j++) {
					System.out.print("□");
				if(j+i==5) {
					System.out.println("");
				}
			  }
			}
			for(int k=0; k<=5; k++) {
				for(int l=1; l<=k; l++) {
					System.out.print("□");
				
			}
				for(int l=1; l<=5-k; l++) {
					System.out.print("■");
					if(k+l==5) {
						System.out.println("");
				}
			  }
			}
	}
}
