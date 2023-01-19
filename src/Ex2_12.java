
public class Ex2_12 {
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score ="+score);
		System.out.println("d="+d);
		System.out.println((byte)(256%256));  // 나누어 떨어지면 0
		System.out.println((400%256));			// 144
		System.out.println((byte)(400%256));	// 조금 헷갈리네
	}
}
