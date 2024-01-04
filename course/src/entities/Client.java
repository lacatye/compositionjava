package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String clientName;
	private String clientEmail;
	private Date birthDateClient;
	
	public Client() {
	}

	public Client(String clientName, String clientEmail, Date birthDateClient) {
		this.clientName = clientName;
		this.clientEmail = clientEmail;
		this.birthDateClient = birthDateClient;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public Date getBirthDateClient() {
		return birthDateClient;
	}

	public void setBirthDateClient(Date birthDateClient) {
		this.birthDateClient = birthDateClient;
	} 
	
	@Override
	public String toString() {
		return clientName + " (" + sdf.format(birthDateClient) + ") - " + clientEmail;
 	}
}
