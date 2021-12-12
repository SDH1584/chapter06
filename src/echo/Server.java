package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.206", 10001));
		
		System.out.println("<서버시작>");
		System.out.println("=========");
		System.out.println("연결을 기다리고잇습니다");
		
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트가 연결됬습니다");
		
		
		
		//메세지 받기 스트림
		InputStream is=socket.getInputStream();
		InputStreamReader isr= new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);

		
		//메세지 보내기용 스트림
		OutputStream os=socket.getOutputStream();//주스트림 
		OutputStreamWriter isw= new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw=new BufferedWriter(isw);
		
		
		//메세지 받기
		String msg= br.readLine();
		System.out.println("받은메세지 : "+msg);
		
		//메세지보내기
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		socket.close();
		serverSocket.close();
	}

}
