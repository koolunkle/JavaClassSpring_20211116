package Codes;

public class MainDrive {

	public static void main(String[] args) {

//		2 x 1 = 2... 2 x 9 = 18

		for (int i = 1; i <= 9; i++) {

//		System.out.println("2 X " + i + " = " + 2*i);

//		}

//		String 가공하기.
			System.out.println(String.format("2 X %d = %d", i, 2 * i));

		}

//		String.format 예시

		String name = "김준기";
		int age = 26;
		long money = 5000000000L;
		double height = 168.5;

//		김준기 - 26세, 키 - 168.5, 보유 자산 - 5000000000원 

		System.out.println(String.format("%s - %d세, 키 - %.1f, 보유 자산 - %,d원", name, age, height, money));

//		contains / startsWith 예시
		String content = "안녕하세요, 저는 김학생입니다.";

//		content에는 김준기가 언급되었는가?

		if (content.contains("김준기")) {
			System.out.println("김준기 언급 됨");
		} else {
			System.out.println("언급 안됨");
		}

		String siteUrl = "http://naver.com";

//		보안 처리가 된 사이트인가? -> http://로 시작되는가?

		if (siteUrl.startsWith("https://")) {
			System.out.println("보안처리 OK");
		} else {
			System.out.println("보안처리 NO");
		}

//		replace 예시

		String content2 = "제가 제일 좋아하는 영화는 쇼생크탈출 입니다.";

//		content2의 내용 교체 -> 쇼생크탈출 -> 인터스텔라

		String newContent2 = content2.replace("쇼생크탈출", "인터스텔라");

		System.out.println(newContent2);

//		split 예시

		String hashTagStrFromServer = "국비지원,안드로이드,백엔드,개발실무,동대문구";

		String[] hashTagArr = hashTagStrFromServer.split(",");

//		분리된 목록 출력 - 배열 내용물 하나씩 조회 - for each

		for (String tag : hashTagArr) {
			System.out.println(String.format("#%s", tag));
		}

	}

}