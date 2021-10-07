package com.aula.restapi;

import java.util.List;

import com.aula.restapi.database.repositorioDespesa;
import com.aula.restapi.entidade.despesa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/despesa")
public class despesaRest {
    @Autowired
    private repositorioDespesa repositorio;

    @GetMapping
    public List<despesa>listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody despesa despesa){
        repositorio.save(despesa);
    }

    @PutMapping
    public void alterar(@RequestBody despesa despesa){
        if(despesa.getId()>0)
        repositorio.save(despesa);
    }

    @DeleteMapping
    public void excluir(@RequestBody despesa despesa){
        repositorio.delete(despesa);
    
    }
}
