package JY;
import java.io.IOException;
import java.util.Scanner;

class Rectangle {
	String figName; // 도형이름
	int horizontal; // 가로
	int vertical; // 세로
	int area; // 넓이
	int round; // 둘레
}

public class TestTest_squareJY {

	public static void main(String[] args) {
		Rectangle[] r1 = new Rectangle[5]; // 직사각형 배열

		for (int i = 0; i < r1.length; i++) {
			r1[i] = new Rectangle();
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("직사각형 5개의 '이름','가로','세로'를 입력해 주세요\n이름\t가로\t세로");
		// ㄴㄴㄴㄴㄴㄴ
		// 이름,가로,세로 입력받아서 저장
		for (int i = 0; i < r1.length; i++) {
			r1[i].figName = sc.next();
			r1[i].horizontal = Integer.parseInt(sc.next());
			r1[i].vertical = Integer.parseInt(sc.next());
		}

		// 넓이, 둘레 연산해서 저장
		for (int i = 0; i < r1.length; i++) {
			r1[i].area = r1[i].horizontal * r1[i].vertical;
			r1[i].round = 2 * (r1[i].horizontal + r1[i].vertical);
		}

		int[][] operator = new int[r1.length][4];
		for (int i = 0; i < r1.length; i++) {
			for (int j = 0; j < operator[i].length; j++) {
				if (j == 0)
					operator[i][j] = r1[i].horizontal;
				else if (j == 1)
					operator[i][j] = r1[i].vertical;
				else if (j == 2)
					operator[i][j] = r1[i].area;
				else
					operator[i][j] = r1[i].round;
			}

		}

		// 이름,가로,세로,넓이,둘레 값 res[]에 저장
		String[] res = new String[r1.length]; // 이름,가로...둘레
		for (int i = 0; i < r1.length; i++) {
			res[i] = r1[i].figName + "\t";
			for (int j = 0; j < operator[i].length; j++) {
				res[i] += operator[i][j] + "\t";
			}
		}

		String res2 = new String(); // 넓이합,넓이평균,둘레합,둘레평균
		int tempA = 0; // 넓이합
		int tempA2 = 0; // 넓이평균
		int tempR = 0; // 둘레합
		int tempR2 = 0; // 둘레평균
		for (int i = 0; i < r1.length; i++) {
			for (int j = 0; j < r1.length; j++) {
				if (j == 2)
					tempA += operator[i][j]; // 넓이합
				else if (j == 3)
					tempR += operator[i][j]; // 둘레합
			}
		}
		tempA2 = tempA / r1.length; // 넓이평균
		tempR2 = tempR / r1.length; // 둘레평균

		res2 = "\t\t\t";

		res2 += tempA + "\t" + tempA2 + "\t" + tempR + "\t" + tempR2 + "\t";

		// 출력
		System.out.println("\n이름\t가로\t세로\t넓이\t둘레");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

		System.out
				.println("-------------------------------------------------------" + "\n\t\t\t넓이합계\t넓이평균\t둘레합계\t둘레평균");

		System.out.println(res2);
	}

}
