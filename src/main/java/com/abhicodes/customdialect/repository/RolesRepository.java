package com.abhicodes.customdialect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.abhicodes.customdialect.entity.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, String>, QuerydslPredicateExecutor<Roles> {

}
