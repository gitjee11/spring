package fr.formation.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.inti.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

}
