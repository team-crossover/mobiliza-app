package com.crossover.mobiliza.app.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.crossover.mobiliza.app.data.local.converters.Converters;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity(tableName = "eventos")
public class Evento {

    @PrimaryKey
    private Long id;

    private List<Long> idsConfirmados = new ArrayList<>();

    private Long idOng;

    private String nome;

    private String descricao;

    private String regiao;

    private String endereco;

    private String dataRealizacao;

    private String img;

    private String categoria;

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

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public Calendar getDataRealizacaoAsCalendar() {
        return Converters.stringToCalendar(dataRealizacao);
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public void setDataRealizacao(Calendar dataRealizacao) {
        this.dataRealizacao = Converters.calendarToString(dataRealizacao);
    }

    public Long getIdOng() {
        return idOng;
    }

    public void setIdOng(Long idOng) {
        this.idOng = idOng;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
