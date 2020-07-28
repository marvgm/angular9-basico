package com.github.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Produto extends PanacheEntity {
	public String nome;
	
	public BigDecimal valor;
	
	@CreationTimestamp
	public Date dataCriacao;
	
	@CreationTimestamp
	public Date dataAtualizacao;
	

}
