package io.github.giovanicaf.domain.repository;

import io.github.giovanicaf.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {


}
