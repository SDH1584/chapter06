package echo.ex04;

public class ThreadApp {
	public static void main(String[] args) {
		
		Thread thread1=new DigitThread();
		Thread thread2=new UpperThread();
		Thread thread3=new LowerThread();
		
		thread1.run();
		thread2.run();
		thread3.run();
		
	}
	

}
