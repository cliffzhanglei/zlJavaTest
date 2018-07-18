package com.imooc.test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
		//int result = tct.test();
		//System.out.println("test()方法，执行完毕！返回值为："+result);
		
		//tct.test2();
		System.out.println("I want to tell you aloudly! test2() is finished!!");
		
		tct.test3();

	}
	
	public int test() {
		int divider = 10;
		int result = 100;
		try {
			while(divider > -1) {
				divider--;
				result = result + 100/divider;
				//System.out.println(result);
			}
			
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环抛出异常了！！！");
			return -1;
		}
	}
	
	public int test2() {
		int divider = 10;
		int result = 100;
		try {
			while(divider > -1) {
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("循环抛出异常了！！！");
			return result=999;
		}finally {
			System.out.println("this is finally!!! Haha!!");
			System.out.println("I'm result!! my value is:" +result);
		}
	}
		
		public int test3() {
			int divider = 10;
			int result = 100;
			try {
				while(divider > -1) {
					divider--;
					result = result + 100/divider;
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("循环抛出异常了！！！");
			}finally {
				System.out.println("this is finally!!! Haha!!");
				System.out.println("I'm result!! my value is:" +result);
			}
			System.out.println("test()");
			return 111;
	}

}
