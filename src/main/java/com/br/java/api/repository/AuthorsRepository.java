package com.br.java.api.repository;

import com.br.java.api.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {

    Authors findById(Integer id);
}
