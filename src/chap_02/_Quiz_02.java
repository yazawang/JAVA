package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오
        // 키가 120 cm 이상인 경우에만 탑승 가능
        // 삼형 연산자 이용

        int x = 115;
        int y = 121;
        int min = 120;

        String a = (x > min) ? "cm 이므로 탑승 가능 합니다" : "cm 이므로 탑승 불가능 합니다";
        String b = (y > min) ? "cm 이므로 탑승 가능 합니다" : "cm 이므로 탑승 불가능 합니다";
        System.out.println("키가 " + x + a);
        System.out.println("키가 " + y + b);

        // 실행 결과
        // 키가 115cm 이므로 탑승 불가능 합니다
        // 키가 121cm 이므로 탑승 가능 합니다
    }
}
