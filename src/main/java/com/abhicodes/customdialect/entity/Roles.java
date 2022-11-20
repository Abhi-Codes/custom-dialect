package com.abhicodes.customdialect.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonType;

import lombok.Data;

@Entity
@Table(name = "abhi_roles")
@Data
@TypeDef(name = "json", typeClass = JsonType.class)
public class Roles implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "employeeId", length = 10)
	private String employeeId;

	@Column(name = "username")
	private String username;

	@Type(type = "json")
	@Column(name = "roles", columnDefinition = "json")
	private List<String> roles;

}
