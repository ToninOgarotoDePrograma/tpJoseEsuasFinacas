package com.tpPratico.trabalhoPratico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "lixeira")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lixeira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long entradaId;

    private String nome;

    @Enumerated(EnumType.STRING)
    private ClassificationEnum clasi;

    private double valor;

    private LocalDate dataEntrada;

    private LocalDateTime dataCadastro;

    private LocalDateTime dataExclu;

}
