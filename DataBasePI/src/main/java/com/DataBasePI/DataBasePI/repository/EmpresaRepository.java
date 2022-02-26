package com.DataBasePI.DataBasePI.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.DataBasePI.DataBasePI.models.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

	Empresa findById(long id);
	
}
