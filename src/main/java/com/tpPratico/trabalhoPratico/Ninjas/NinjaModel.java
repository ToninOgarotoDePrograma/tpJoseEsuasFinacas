package com.tpPratico.trabalhoPratico.Ninjas;

import com.tpPratico.trabalhoPratico.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//classe em entidade do BD
//jpa = java persistence api

@Entity // bd
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id //defini o id, primeira variavel abaixo
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremental
    private Long id;// <- esta
    private String nome;
    private String email;
    private int idade;

    // muitos pra um, varios ninja tem uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave estrangeira || Foreing key
    private MissoesModel missoes;




}
