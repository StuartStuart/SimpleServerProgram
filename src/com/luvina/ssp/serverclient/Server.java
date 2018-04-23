package com.luvina.ssp.serverclient;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	private ServerSocket serSoc;
	private Runnable rnb;
	private Thread thr;

	public void initServer(int port) {
		try {
			serSoc = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rnb = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				waitAClient();
			}
		};
		thr = new Thread(rnb);
		thr.start();
	}

	private void waitAClient() {
		try {
			System.out.println("Wait a client!");
			serSoc.accept();
			System.out.println("Accept a client!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
