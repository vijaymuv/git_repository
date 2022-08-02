package org.client;

import org.company.Company;

public class Client extends Company {
	public void clientName() {
System.out.println("clientName: accenture");
	}
public static void main(String[] args) {
	Client c = new Client();
	c.clientName();
	c.clientName3();
	Company b = new Company();
	b.companyName();
	
}
}
