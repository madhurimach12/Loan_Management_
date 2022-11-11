package com.luma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luma.entity.EmployeeIssueEntity;

public interface EmployeeIssueEntityReposity extends JpaRepository<EmployeeIssueEntity, Long> {

}
