package com.br.java.api.repository;

import com.br.java.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(Integer id) throws Exception;
}
