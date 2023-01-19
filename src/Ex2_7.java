
public class Ex2_7 {
	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X) %n", ch, code, code);
		
		char hch = '가';
		hch = '\uAC00';  // 유니코드를 넣어도 되고
		hch = 0XAC00;	// 16진수를 넣어도 된다.
		System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch);
	}
}
