package com.aula.restapi.database;

import com.aula.restapi.entidade.receita;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioReceita extends JpaRepository<receita,Long>{
    
}
