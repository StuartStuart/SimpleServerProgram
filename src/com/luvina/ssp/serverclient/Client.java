package com.luvina.ssp.serverclient;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket cliSoc;

	public void initClient(String locHost, int port) {
		try {
			cliSoc = new Socket(locHost, port);
			System.out.println("Sent connection requirement!");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
