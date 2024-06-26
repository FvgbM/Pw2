package backend.loja.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import backend.loja.entity.ProdutoEntity;

@Repository
public interface ProdutoRepository  extends 
JpaRepository<ProdutoEntity, Integer>, 
JpaSpecificationExecutor<ProdutoEntity> {
    @Query(value = "select * from produto where nome like ?1",
     nativeQuery = true)
    List<ProdutoEntity> buscar(String busca);

    
} 