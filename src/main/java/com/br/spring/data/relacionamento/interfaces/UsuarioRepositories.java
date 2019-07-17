package com.br.spring.data.relacionamento.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.spring.data.relacionamento.Models.Usuario;
@Repository
public interface UsuarioRepositories extends CrudRepository<Usuario, Integer >{

}
