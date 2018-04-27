package com.luvina.ssp.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// Server server = new Server();
		// server.initServer(4499);
		// Client client = new Client();
		// client.initClient("LocalHost", 4499);

		// BufferedReader reader = null;
		//
		// try {
		// File file = new File("D:/Ann/SLA.sign");
		// reader = new BufferedReader(new FileReader(file));
		//
		// String line;
		// while ((line = reader.readLine()) != null) {
		// System.out.println(line.length());
		// }
		//
		// reader.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		System.out.print("Enter your name: ");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		String name = "";
		try {
			name = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello, " + name + ". Enter three ints...");
		int[] values = new int[3];
		double sum = 0.0;
		for (int i = 0; i < values.length; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			String temp = "";
			try {
				temp = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			values[i] = Integer.parseInt(temp);
			sum += values[i];
		}
		System.out.println("The average equals " + sum / values.length);
	}

}
