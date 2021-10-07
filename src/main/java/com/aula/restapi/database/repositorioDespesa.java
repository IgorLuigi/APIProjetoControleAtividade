package com.aula.restapi.database;

import com.aula.restapi.entidade.despesa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioDespesa extends JpaRepository<despesa,Long>{
    
}
