package imooc;

public class randomnum {
	public static void main(String[] args) {
		int a = 1,b = 1;
		for(int i=0;i<50;i++) {
			System.out.println(a+' '+b);
			a = b;
			b = a + b;
		}
		
	}

}
