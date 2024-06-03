package service;

import java.util.Scanner;

import util.squareClassArrCustom;

public class squareClass {
	
	// main
	public static void main(String[] args) {
		// 직사삭형 클래스를 완성
		// 멤버변수 : 도형이름, 가로, 세로, 넓이(가로x세로), 둘레((가로x세로)x2)
			// member : sqName, width, height, area, perimeter
		// 직사각형 5개를 입력받아서 넓이, 둘레의 전체 합계와 평균을 구할 것
		
		Scanner sc = new Scanner(System.in);
		squareClassArrCustom arr = new squareClassArrCustom();
		
		// width 입력 받고 배열생성
		System.out.println("사각형 가로길이를 쉼표로 구분하여 총 5개 입력해주세요.");
		String width = sc.next();
		int[] widthArr = arr.TransArr(width);

		
		// height 배열생성 및 값 대입
		System.out.println("사각형 세로길이를 쉼표로 구분하여 총 5개 입력해주세요.");
		String height = sc.next();
		int[] heightArr = arr.TransArr(height);;
		
		
		
		
		
		
		//System.out.println(heightArr[0]);
	}// main end
}













