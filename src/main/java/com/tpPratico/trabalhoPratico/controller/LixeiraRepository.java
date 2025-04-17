package com.tpPratico.trabalhoPratico.controller;

import com.tpPratico.trabalhoPratico.model.Lixeira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LixeiraRepository extends JpaRepository<Lixeira , Long> {
    Lixeira findTopByOrderByDataExcluDesc();//ultimo Excluido

}
