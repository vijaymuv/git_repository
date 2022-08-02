package org.company;

public class Company {
	public void companyName() {
		System.out.println("company name: greens tech");
	}

	private void clientName1() {
		System.out.println("clientName: accenture1");
	}

	void clientName2() {
		System.out.println("clientName: accenture2");

	}

	protected void clientName3() {
		System.out.println("3");
	}
	public static void main(String[] args) {
		Company c = new Company();
		c.clientName1();
	}
	
}