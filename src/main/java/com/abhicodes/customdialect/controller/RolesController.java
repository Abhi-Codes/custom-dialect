package com.abhicodes.customdialect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhicodes.customdialect.entity.Roles;
import com.abhicodes.customdialect.service.RolesService;

@RestController
@RequestMapping("/api/user-roles")
public class RolesController {

	@Autowired
	RolesService rs;

	@GetMapping
	public List<Roles> getUsersHavingRole(@RequestParam(required = true) String role) {
		return rs.findUsersWithRoles(role);
	}
}
