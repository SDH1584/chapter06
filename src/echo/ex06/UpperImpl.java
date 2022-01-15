package echo.ex06;

import echo.ex03.DigitThread;

public class UpperImpl extends Thread{

	public static void main(String[] args) throws InterruptedException{
		Thread thread = new DigitThread();
		thread.start();
		
		for(char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}