package com.manon.pluralsight.repositories;

import com.manon.pluralsight.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
