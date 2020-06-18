//5桁目標
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
    		if(length==2&&c[0]!="1"||length<2||length>2) {
    			if(c[length-1]=="1") {
    				s[length-1]="one";
			 　 }else if(c[length-1]=="2") {
				    s[length-1]="two";
				}else if(c[length-1]=="3") {
					s[length-1]="tree";
				}else if(c[length-1]=="4") {
					s[length-1]="four";
			    }else if(c[length-1]=="5") {
					s[length-1]="five";
				}else if(c[length-1]=="6") {
					s[length-1]="six";
				}else if(c[length-1]=="7") {
					s[length-1]="seven";
				}else if(c[length-1]=="8") {
					s[length-1]="eight";
				}else if(c[length-1]=="9") {
					s[length-1]="nine";
				}else if(c[length-1]=="2") {
					s[length-1]="";
				}
    		}
    		if(length>1) {
    			if(c[length-2]=='1') {
    				s[length-2]="eleven";
    			}else if(c[length-1]=='2') {
    				s[length-2]="twelve";
    			}
    		}
    			
    		}
    }
}



