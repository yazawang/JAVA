package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        char c = 'A'; // 알파벳 대문자는 65 부터 시작, 소문자는 97 부터 시작, 숫자는 48 부터 시작
        System.out.println(c); // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); // 66

        c++;
        System.out.println(c); // C
        System.out.println((int)c); // 67

        // 세로 크기 10 x 가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
