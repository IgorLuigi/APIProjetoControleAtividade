package com.aula.restapi.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Float prioridade;
    @Column(nullable = false)
    private String tipoAtividade;
    @Column(nullable = true)
    private Boolean feito;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Float getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(Float prioridade) {
        this.prioridade = prioridade;
    }
    public String getTipoAtividade() {
        return tipoAtividade;
    }
    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }
    public Boolean getFeito() {
        return feito;
    }
    public void setFeito(Boolean feito) {
        this.feito = feito;
    }
 
    
}
