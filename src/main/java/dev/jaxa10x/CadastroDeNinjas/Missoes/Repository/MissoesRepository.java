package dev.jaxa10x.CadastroDeNinjas.Missoes.Repository;

import dev.jaxa10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository são interfaces que trabalham com a persistencia em dados
//Repositorys não são classes
//Estou extendendo o JpaRespository e pedindo para escanear a classe MissoesModel com o tipo do ID dessa classe (no caso o Long).
//o JPA tem uma serie de metodos que vao ajudar a manipular os dados no banco de dados, como salvar, buscar, deletar, etc.
//nas chaves de maior e menor eu passo a classe que o ORM vai escanear e o tipo do ID dessa classe.
//O JPA ajuda a gente a lidar de maneria mais fácil com o banco de dados, sem precisar escrever SQL diretamente.


public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

    // Aqui você pode adicionar métodos personalizados, se necessário
}
