package br.com.fiap.financaspro.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.fiap.financaspro.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

    List<Movimentacao> findByCategoriaNome(String categoria);

    @Query("SELECT m FROM Movimentacao m WHERE MONTH(m.data) = ?1") //SQL JPQL - Java Persistence Query Language
    List<Movimentacao> findByMes(Integer mes);
    
    @Query("SELECT m FROM Movimentacao m WHERE MONTH(m.data) = :mes AND m.categoria.nome = :categoria") 
    List<Movimentacao> findByCategoriaNomeAndMes(@Param("categoria")  String categoria, @Param("mes") Integer mes);

    @Query("SELECT m FROM Movimentacao ORDER BY m.id LIMIT :size OFFSET :offset")
    Page<Movimentacao> findAllPageable(@Param("offset") int offset, @Param("size") Integer size);
}
