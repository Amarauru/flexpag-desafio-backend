package com.flexpag.paymentscheduler.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;


@Entity (name = "payment")
@NoArgsConstructor
public class PaymentModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long id;
	private String nome;
	private BigDecimal valor;
	private PaymentStatus status;
	
	public PaymentModel (long id,String name,BigDecimal valor) {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public PaymentModel get() {
		return null;
	}
	
	
	
	

}
