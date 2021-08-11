package io.github.giovanicaf.domain.repository;

import io.github.giovanicaf.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido  extends JpaRepository<ItemPedido, Integer> {


}
