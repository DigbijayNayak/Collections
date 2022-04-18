import java.util.Scanner;

public class Solutions {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() == b.length()) {
            char[] a1 = a.toUpperCase().toCharArray();
            char[] b1 = b.toUpperCase().toCharArray();
            boolean flag = false;
            for (int i = 0; i < a1.length; i++) {
                int c1 = 0, c2 = 0;
                for (int j = 0; j < b1.length; j++) {
                    if (a1[i] == a1[j]) {
                        c1++;
                    }
                    if (a1[i] == b1[j]) {
                        c2++;
                    }
                }
                if (c1 == c2) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

// import java.util.Scanner;

// public class Solution {

// static boolean isAnagram(String a, String b) {
// // Complete the function
// if(a.length() == b.length()){
// char[] a1 = a.toUpperCase().toCharArray();
// char[] b1 = b.toUpperCase().toCharArray();
// boolean flag = false;
// for (int i = 0; i < a1.length; i++) {
// int c1 = 0, c2 = 0;
// for (int j = 0; j < b1.length; j++) {
// if(a1[i] == a1[j]){
// c1++;
// }
// if(a1[i] == b1[j]){
// c2++;
// }
// }
// if(c1 == c2){
// flag = true;
// }
// else{
// flag = false;
// break;
// }
// }
// if (flag) {
// return true;
// }
// else{
// return false;
// }
// }
// else{
// return false;
// }

// }

// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// String a = scan.next();
// String b = scan.next();
// scan.close();
// boolean ret = isAnagram(a, b);
// System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
// }
// }
