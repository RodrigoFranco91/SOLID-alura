package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado {
	
	private DadosPessoais dadosPessoais;
	private String nomeEmpresa;
	
	public Terceirizado(String nomeEmpresa, String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nomeEmpresa = nomeEmpresa;
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}
		
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	

}
