package com.victorvzx.CadastroDeNinjas.Ninjas;


import com.victorvzx.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;


// JPA = Java Persistence API

// Entity transforma uma classe numa entidade do banco de dados
@Entity
// Cria a tabela "tb_cadastro_de_ninjas"
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    // Define como o ‘ID’ será gerado, nesse caso, estratégia IDENTITY!
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private List<MissoesModel> missoes;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
