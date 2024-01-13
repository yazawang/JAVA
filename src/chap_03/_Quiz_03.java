package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        String s1 = "901231-1234567";
        System.out.println(s1.substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(s1.substring(0,s1.indexOf("-") + 2)); // 위와 같음

        String s2 = "030708-4567890";
        System.out.println(s2.substring(0,8));
        System.out.println(s2.substring(0,s1.indexOf("-") + 2)); // 위와 같음
    }
}
