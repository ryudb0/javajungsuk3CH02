package example;

public class Ex2_9 {
	
	public void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
//	형변환 생략이 가능한것은? 모두 고르시오
		
		b = (byte) i;			//a
		ch = (char) b;			//b
		short s = (short)ch;	//c
		float f = (float)l;		//d
		i = (int)ch;			//e
//	d, e
//	이거좀 헷갈린다.
		
	}

}
