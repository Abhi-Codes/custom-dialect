package com.abhicodes.customdialect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhicodes.customdialect.entity.QRoles;
import com.abhicodes.customdialect.entity.Roles;
import com.abhicodes.customdialect.repository.RolesRepository;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;

@Service
public class RolesService {

	@Autowired
	RolesRepository rr;

	public List<Roles> findUsersWithRoles(String role) {
		QRoles userRolesPath = QRoles.roles1;
		BooleanExpression exp = Expressions
				.booleanTemplate("json_contains_key({0}, {1})", userRolesPath.roles, Expressions.constant(role))
				.isTrue();
		Iterable<Roles> lr = rr.findAll(exp);
		List<Roles> result = new ArrayList<>();
		lr.forEach(result::add);
		return result;
	}
}
