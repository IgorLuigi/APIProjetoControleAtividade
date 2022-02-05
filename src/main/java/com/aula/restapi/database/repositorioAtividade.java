package com.aula.restapi.database;

import com.aula.restapi.entidade.atividade;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioAtividade extends JpaRepository<atividade,Long>{
    
}
