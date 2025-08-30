import java.util.*;

class StringB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // If alphabet, just continue
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                continue;
            }
            else {
                int num = ch - '0';
                if (num > 0 && i > 0) {
                    String temp = String.valueOf(s1.charAt(i - 1));
                    for (int j = 1; j <= num; j++) {
                        s2 = s2.concat(temp);
                    }
                }
            }
        }

        System.out.println(s2);
    }
}
