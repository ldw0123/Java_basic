package ch05;

public class Ex5_1 {

	public static void main(String[] args) {
		// int[] score; 		// 배열 score 선언 (참조변수)
		// score = new int[5]; 	// 배열 생성
		
		int[] score = new int[5]; 		// 배열의 선언과 생성을 동시에
		score[3] = 100;					// score[3]에 100을 저장
		
		System.out.println("score[0] = "+score[0]);	
		System.out.println("score[1] = "+score[1]);
		System.out.println("score[2] = "+score[2]);
		System.out.println("score[3] = "+score[3]); // 100 출력
		System.out.println("score[4] = "+score[4]);
		System.out.println();
		
		int value = score[3];
		System.out.println("value = "+value);
	
	}

}
