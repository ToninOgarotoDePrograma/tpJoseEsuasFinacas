package com.tpPratico.trabalhoPratico.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "entries")
@Data
@Builder
public class Cfinancas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome ;

    @Enumerated(EnumType.STRING)
    private ClassificationEnum clas;

    private double valor;

    private LocalDate dataEntrada;

    private LocalDateTime dataCadastro;


}
