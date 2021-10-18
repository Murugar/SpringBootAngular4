package com.app.security.auth;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Data
public class  JwtAuthenticationRequest implements Serializable {

    private String username;
    private String email;
    private String password;

    public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String username, String email, String password) {
        this.setUsername(username);
        this.setEmail(email);
        this.setPassword(password);
    }

	public void setPassword(String password2) {
		this.password = password2;
		
	}

	public  void setEmail(String email2) {
		this.email = email2;
		
	}

	public  void setUsername(String username2) {
		this.username = username2;
		
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
}
