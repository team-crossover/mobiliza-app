package com.crossover.mobiliza.app.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity(tableName = "eventos")
public class Evento {

    @PrimaryKey
    private Long id;

    private Long idOng;

    private List<Long> idsConfirmados = new ArrayList<>();

    private String nome;

    private String descricao;

    private String regiao;

    private String endereco;

    private Calendar dataRealizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdOng() {
        return idOng;
    }

    public void setIdOng(Long idOng) {
        this.idOng = idOng;
    }

    public List<Long> getIdsConfirmados() {
        return idsConfirmados;
    }

    public void setIdsConfirmados(List<Long> idsConfirmados) {
        this.idsConfirmados = idsConfirmados;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Calendar dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
}
