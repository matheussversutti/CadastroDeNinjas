package dev.jaxa10x.CadastroDeNinjas.Ninjas.Model;

import dev.jaxa10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity ele transforma a classe em uma tabela no banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Aqui vou passar uma estrategia de como eu vou gerar o ID)
     private Long id;

     private String nome;
     private String email;
     private int idade;

     //Muitos ninjas pra uma missão
     @ManyToOne
     @JoinColumn(name = "missoes_id") //Chave estrangeira
     private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //Sobrecarga de construtor
    public NinjaModel(String nome, String email, int idade, MissoesModel missoes) {
        this (nome, email, idade);
        this.missoes = missoes;
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
