package backend.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import backend.loja.entity.ItemEntity;

@Repository
public interface ItemRepository  
extends JpaRepository<ItemEntity, Integer>, 
JpaSpecificationExecutor<ItemEntity>{

}
