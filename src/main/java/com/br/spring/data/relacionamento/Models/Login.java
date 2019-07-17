package com.br.spring.data.relacionamento.Models;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Login implements Serializable {
	private static final long serialVarsionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "O apelido não pode estar em branco!")
	@Size(min = 4,message = "O apelido não pode ter menos que 4 letras! ")
	private String apelido;
	@NotBlank(message = "A senha não pode estar em branco!")
	@Size(min = 8, message = "A senha não pode ter menos de 8 caracteres!")
	private String senha;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Usuario usuario;

	public Login() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
