package moe.cafe.inspiration.main.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import moe.cafe.inspiration.main.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
}