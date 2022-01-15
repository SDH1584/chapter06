package echo.ex03;

import echo.ex04.LowerThread;
import echo.ex04.UpperThread;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException{
		Thread thread1 = new DigitThread();
		thread1.start();
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}
