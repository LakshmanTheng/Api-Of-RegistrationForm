package com.empapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empapi.entity.Employee;

@Repository
public interface Employrepo extends JpaRepository<Employee, Integer>{

}
