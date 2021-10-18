package com.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String label;

    public Role(String label) {
        this.label = label;
    }

	public Role(long l, String s) {
		this.id = l;
		this.label = s;
	}

	public String getLabel() {
		// TODO Auto-generated method stub
		return this.label;
	}

}
