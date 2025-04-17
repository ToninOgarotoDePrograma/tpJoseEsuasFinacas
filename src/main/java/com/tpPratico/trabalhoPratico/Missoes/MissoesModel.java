package com.tpPratico.trabalhoPratico.Missoes;

import com.tpPratico.trabalhoPratico.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    private NinjaModel ninja;

    //uma missao pode ter varios ninjas -> @OneToMany

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
