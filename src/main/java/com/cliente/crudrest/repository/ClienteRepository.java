package com.cliente.crudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliente.crudrest.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findById(long id);

}
