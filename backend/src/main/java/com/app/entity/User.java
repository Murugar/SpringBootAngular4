package com.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "users")
@Data
@Setter
@Getter
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(nullable = false, unique = true)
    private String name;

    @Email
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull
    private String password;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public User(String name, String email, String password, Role role) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setRole(role);
    }

    public void setRole(Role role2) {
	   this.role = role2;
		
	}

	public void setEmail(String email2) {
		this.email = email2;
		
	}

	public void setName(String name2) {
		this.name = name2;
		
	}

	@JsonIgnore
    public String getPassword() {
        return this.password;
    }

    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }

	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	public Role getRole() {
		// TODO Auto-generated method stub
		return this.role;
	}

	public void setId(long i) {
		this.id = i;
		
	}
}
