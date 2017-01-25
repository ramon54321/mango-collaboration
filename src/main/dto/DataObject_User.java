package main.dto;

import javax.persistence.*;

@Entity
public class DataObject_User {

	@Id
	@GeneratedValue
	private int userId;
	private String username;
	//private String 

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return this.userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return this.username;
	}
}