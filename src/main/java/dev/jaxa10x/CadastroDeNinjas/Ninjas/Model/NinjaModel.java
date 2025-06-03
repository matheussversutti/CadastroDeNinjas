package dev.jaxa10x.CadastroDeNinjas.Ninjas.Model;

import dev.jaxa10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//Entity ele transforma a classe em uma tabela no banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
//o Data do Lombok gera os métodos getters e setters automaticamente
@Data
// Lombok é uma biblioteca que ajuda a reduzir o boilerplate de código
//Com o NoArgsConstructor e AllArgsConstructor, o Lombok vai gerar construtores sem argumentos e com todos os argumentos

@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) //Aqui vou passar uma estrategia de como eu vou gerar o ID)
    @Column(name = "id_ninja") //Dando um nome para a coluna de ID (vai aparecer no banco de dados)
    private Long id;

    @Column(name = "nome") //Dando um nome para a coluna de nome (vai aparecer no banco de dados)
    private String nome;

    @Column(name = "email", unique = true) //Coluna unica, não pode ter repetição
    private String email;

    @Column(name="img_url") //Dando um nome para a coluna de imagem (vai aparecer no banco de dados)
    private String imgUrl;

    @Column(name = "idade") //Dando um nome para a coluna de idade (vai aparecer no banco de dados)
    private int idade;

    //Muitos ninjas pra uma missão
    @ManyToOne
    //O JoinColumn é usado para especificar a coluna que será usada como chave estrangeira na tabela
    @JoinColumn(name = "missoes_id") //Chave estrangeira
    private MissoesModel missoes;



}