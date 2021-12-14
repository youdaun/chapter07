package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.16", 10001)); //외워야함
		
		System.out.println("~server 시작~");
		System.out.println("=======================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		while(true) {
			
			Socket socket = serverSocket.accept();
			
			Thread thread = new ServerThread(socket); //전화번호 전달
			thread.start(); //출장코드 (회선강화 > 3단, 메세지 주고받기) 종료코드
			
			/*
			if() {
				break;
			}
			*/
		}
		
		/*
		System.out.println("================================");
		System.out.println("<서버종료>");
	
		serverSocket.close();
		*/
	}

}
