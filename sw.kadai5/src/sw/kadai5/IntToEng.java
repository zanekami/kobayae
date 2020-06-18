package sw.kadai5;
import java.util.Scanner;

public class IntToEng {
	// メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

     
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String number = String.copyValueOf(n);
    	char[] c = number.toCharArray();
    	String[] s = getNum(c.length,c);
    	String num="";
    	for(int i=0;i<s.length;i++) {
    		num+=s[i];
    	}
        return num;
    }
    static String[] getNum (int length,char[] c) {
    	String[] s=new String[length];
    	if(length>0) {
    	}
}



