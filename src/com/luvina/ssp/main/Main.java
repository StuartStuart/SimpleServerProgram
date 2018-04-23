package com.luvina.ssp.main;

import com.luvina.ssp.serverclient.Client;
import com.luvina.ssp.serverclient.Server;

public class Main {

	public static void main(String[] args) {
		Server server = new Server();
		server.initServer(4499);
		Client client = new Client();
		client.initClient("LocalHost", 4499);
	}

}
