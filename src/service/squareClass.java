package service;

import java.util.Scanner;

import util.squareClassArrCustom;
import util.squareClassCalculator;

public class squareClass {

	// main
	public static void main(String[] args) {
		// 직사삭형 클래스를 완성
		// 멤버변수 : 도형이름, 가로, 세로, 넓이(가로x세로), 둘레((가로x세로)x2)
		// member : sqName, width, height, area, perimeter
		// 직사각형 5개를 입력받아서 넓이의 합, 넓이의 평균, 둘레의 합, 둘레의 평균을 구할 것

		Scanner sc = new Scanner(System.in);
		squareClassArrCustom arr = new squareClassArrCustom();
		squareClassCalculator cal = new squareClassCalculator();

		// width 입력 받고 배열생성
		System.out.println("사각형 가로길이를 쉼표로 구분하여 총 5개 입력해주세요.");
		String width = sc.next();
		int[] widthArr = arr.TransArr(width);

		// height 배열생성 및 값 대입
		System.out.println("사각형 세로길이를 쉼표로 구분하여 총 5개 입력해주세요.");
		String height = sc.next();
		int[] heightArr = arr.TransArr(height);

		// 넓이 배열구하기
		int[] areaArr = cal.areaCal(widthArr, heightArr);
		// 둘레 배열구하기
		int[] perimeterArr = cal.perimeterCal(widthArr, heightArr);

		System.out.printf("넓이의 총 합은 %d, 평균은 %d입니다.", areaArr[0], areaArr[1]);
		System.out.println();
		System.out.printf("둘레의 총 합은 %d, 평균은 %d입니다.", perimeterArr[0], perimeterArr[1]);

	}// main end
}
