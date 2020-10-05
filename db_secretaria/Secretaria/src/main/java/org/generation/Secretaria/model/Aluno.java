package org.generation.Secretaria.model;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_alunos")
public class Aluno {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long id;

@NotNull
@Size(min = 5, max = 70)
private String nome;

@NotNull
private Date nascimento;

@NotNull
private String endereço;

@Size (max = 5)
private String serie;

private boolean matriculado;

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

public Date getNascimento() {
	return nascimento;
}

public void setNascimento(Date nascimento) {
	this.nascimento = nascimento;
}

public String getEndereço() {
	return endereço;
}

public void setEndereço(String endereço) {
	this.endereço = endereço;
}

public String getSerie() {
	return serie;
}

public void setSerie(String serie) {
	this.serie = serie;
}

public boolean isMatriculado() {
	return matriculado;
}

public void setMatriculado(boolean matriculado) {
	this.matriculado = matriculado;
}
}
