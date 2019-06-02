package com.drkiettran.jdbc.greetings;

import java.sql.Connection;

public class ActorInfo  {
	
	private Connection connection;
	
	public ActorInfo(Connection connection, String firstName, String lastName) {
		this.connection = connection;
		getFilmInfoByName(firstName, lastName);
		
	}

	private void getFilmInfoByName(String firstName, String lastName) {
		// Print something 
		System.out.println("FirstName: "+firstName + "LastName: "+ lastName);
		
	}

}
