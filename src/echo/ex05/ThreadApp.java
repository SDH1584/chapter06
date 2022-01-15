package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {

		Runnable digit =new DigitRunableImpl();
		Thread thread1=new Thread(digit);
	
		thread1.start();
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
	}
	}
}
