package com.dmota.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmota.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
