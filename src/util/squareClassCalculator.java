package util;

public class squareClassCalculator {
		int[] width; // 가로
		int[] height; // 세로
		int[] area; // 넓이
		int[] perimeter; // 둘레
		
		// 넓이 계산
		public int areaCal(int width, int height) {
			int areaResult;
			areaResult = width * height;
			
			return areaResult;
		}
		
		//둘레 계산
		public int perimeterCal(int width, int height) {
			int perimeterResult;
			perimeterResult = (width + height)*2;
			
			return perimeterResult;
		}
		
		//최종결과 출력
		public void prinResult() {
			
		}
		
	//	
//		public void printResult(int area, int perimeter) {
//			System.out.printf("5개 사격형의 넓이 총 합계는 %d, 둘레의 총 합은 %d입니다.", area, perimeter);
//			System.out.printf("5개 사격형의 넓이 평균은 %d, 둘레 평균은 %d입니다.", area, perimeter);
//		}
}
