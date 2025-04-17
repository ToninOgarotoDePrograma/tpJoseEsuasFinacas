package com.tpPratico.trabalhoPratico.controller;

import com.tpPratico.trabalhoPratico.model.Cfinancas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CfinancaRepository extends JpaRepository<Cfinancas, Long> {

}
