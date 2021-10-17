package com.aula.restapi;

import java.util.List;

import com.aula.restapi.database.repositorioReceita;
import com.aula.restapi.entidade.receita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/receita")
public class receitaRest {
    @Autowired
    private repositorioReceita repositorio;

    @GetMapping
    public List<receita> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody receita receita){
        repositorio.save(receita);
    }

    @PutMapping
    public void alterar(@RequestBody receita receita){
        if(receita.getId()>0)
        repositorio.save(receita);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        repositorio.deleteById(id);
    
    }
}
