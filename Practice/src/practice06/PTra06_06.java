package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++){
		for(int j=1;j<=i;j++) { 
			System.out.print("■");
		}
			for(int j=1;j<=5-i;j++) {
				System.out.print("□");
				if(j+i==5) {
					System.out.println("");
			
			}
		  }
		}
		

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */

	}
}
