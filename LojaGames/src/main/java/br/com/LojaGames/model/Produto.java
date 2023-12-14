package br.com.LojaGames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Produto {

	@Entity
	@Table(name = "tb_categoria")
	public class categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome_categoria é obrigatorio !!")
		@Size(min = 3, max = 100, message = "O atributo categoria deve conter no mínimo 05 e no máximo 100 caracteres")
		@Column(length = 100)
		private String nome_produto;
		
		@NotBlank(message = "O atributo preço é obrigatorio !!")
		private float preco;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome_produto() {
			return nome_produto;
		}

		public void setNome_produto(String nome_produto) {
			this.nome_produto = nome_produto;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}
		
}
	
}