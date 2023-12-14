package br.com.LojaGames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_categoria")
	public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome_categoria é obrigatorio !!")
		@Size(min = 5, max = 100, message = "O atributo categoria deve conter no mínimo 05 e no máximo 100 caracteres")
		@Column(length = 100)
		private String nome_categoria;

		public Long getId() {
			return id;
		} 

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome_categoria() {
			return nome_categoria;
		}

		public void setNome_categoria(String nome_categoria) {
			this.nome_categoria = nome_categoria;
		}

}
	