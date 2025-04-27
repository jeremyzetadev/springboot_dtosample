package com.sample.DTOsample.repository;

import com.sample.DTOsample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
