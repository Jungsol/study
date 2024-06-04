package util;

public class squareClassCalculator {

	// 넓이 계산[합, 평균]
	public int[] areaCal(int[] widthArr, int[] heightArr) {
		int[] areaArr = new int[widthArr.length];
		for (int i = 0; i < widthArr.length; i++) {
			areaArr[0] += widthArr[i] * heightArr[i];
			if(i == widthArr.length-1) {
				areaArr[1] = areaArr[0]/widthArr.length;
			}
		}
		return areaArr;
	}

	// 둘레 계산[합, 평균]
	public int[] perimeterCal(int[] widthArr, int[] heightArr) {
		int[] perimeterArr = new int[widthArr.length];
		for (int i = 0; i < widthArr.length; i++) {
			perimeterArr[0] += (widthArr[i] + heightArr[i])*2;
			if(i == widthArr.length-1) {
				perimeterArr[1] = perimeterArr[0]/widthArr.length;
			}
		}
		return perimeterArr;
	}

}