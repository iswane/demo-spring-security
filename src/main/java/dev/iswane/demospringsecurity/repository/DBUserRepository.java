package dev.iswane.demospringsecurity.repository;

import dev.iswane.demospringsecurity.domain.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Long> {
    DBUser findByUsername(String username);
}
