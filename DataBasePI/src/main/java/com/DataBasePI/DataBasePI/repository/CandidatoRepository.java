package com.DataBasePI.DataBasePI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.DataBasePI.DataBasePI.models.Candidato;
import com.DataBasePI.DataBasePI.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, Long> {

	Iterable<Candidato> findByVaga(Vaga vaga);

	// para deletar pelo RG
	Candidato findByRg(String rg);

	Candidato findById(long id);

	// Query para a busca
	@Query(value = "select u from Candidato u where u.nomeCandidato like %?1%")
	List<Candidato> findByNomesCandidatos(String nomeCandidato);
}
