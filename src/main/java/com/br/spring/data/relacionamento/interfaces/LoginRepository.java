package com.br.spring.data.relacionamento.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.spring.data.relacionamento.Models.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {

	
}
