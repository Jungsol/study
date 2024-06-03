package util;

public class squareClassArrCustom {
	public int[] TransArr(String str) {
		int[] intArr = new int[5];
		
		for(int i = 0; i<intArr.length; i++) {
			String[] tempArr = str.split(",");
			intArr[i] = Integer.parseInt(tempArr[i]);
		}
		return intArr;
	}
}
