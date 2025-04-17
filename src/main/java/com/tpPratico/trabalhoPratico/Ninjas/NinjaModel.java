package com.tpPratico.trabalhoPratico.Ninjas;

import com.tpPratico.trabalhoPratico.Missoes.MissoesModel;
import jakarta.persistence.*;


//classe em entidade do BD
//jpa = java persistence api

@Entity // bd
@Table(name = "tb_cadastro")
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
