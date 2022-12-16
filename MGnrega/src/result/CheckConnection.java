package result;

import java.sql.Connection;

import utility.ConnectionClass;

public class CheckConnection {

	public static void main(String[] args) {
		
		
		
		Connection connection=ConnectionClass.prepareConnection();
		
	    
		
		if(connection!=null) {
			System.out.println("connection granted");
		}
			
		
		
	}
	
	
	
	
}
