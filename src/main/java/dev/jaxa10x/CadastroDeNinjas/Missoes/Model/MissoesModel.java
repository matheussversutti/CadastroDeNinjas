package dev.jaxa10x.CadastroDeNinjas.Missoes.Model;

import dev.jaxa10x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes") //Aqui estou colocando o nome da tabela que vai ser criada no banco de dados
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    //Definindo um ID para a missão
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Aqui vou passar uma estratégia de como eu vou gerar o ID
    private Long id;

    private String nomeMissao;
    private String dificuldade;

    //Uma missão vai ter varios ninjas
    //OnetoMany é uma anotação que indica que uma entidade pode ter várias instâncias de outra entidade associadas a ela
    //o mappedBy indica que a relação é mapeada pela propriedade "missoes" na classe NinjaModel
    @OneToMany(mappedBy = "missoes") //Mapeamento da relação
    private List<NinjaModel> ninjas;




}
