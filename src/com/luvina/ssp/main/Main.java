package com.luvina.ssp.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Server server = new Server();
		// server.initServer(4499);
		// Client client = new Client();
		// client.initClient("LocalHost", 4499);

		BufferedReader reader = null;

		try {
			File file = new File("D:/Ann/SLA.sign");
			reader = new BufferedReader(new FileReader(file));

			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line.length());
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
