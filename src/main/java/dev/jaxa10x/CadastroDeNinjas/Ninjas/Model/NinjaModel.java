package dev.jaxa10x.CadastroDeNinjas.Ninjas.Model;

import dev.jaxa10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//Entity ele transforma a classe em uma tabela no banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Aqui vou passar uma estrategia de como eu vou gerar o ID)
    private Long id;


    private String nome;

    @Column(unique = true) //Coluna unica, não pode ter repetição
    private String email;
    private int idade;

    //Muitos ninjas pra uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Chave estrangeira
    private MissoesModel missoes;



}