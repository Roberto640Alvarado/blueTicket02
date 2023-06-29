package com.grupo9.blueTicket.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo9.blueTicket.models.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
	public User findOneByUsernameOrEmail(String username, String email);

}
