package dev.jaxa10x.CadastroDeNinjas.Missoes.Model;

import dev.jaxa10x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;
    private String dificuldade;

    //Uma missão vai ter varios ninjas
    @OneToMany(mappedBy = "missoes") //Mapeamento da relação
    private List<NinjaModel> ninjas;




}
