package com.manon.pluralsight.repositories;

import com.manon.pluralsight.models.Session;
import com.manon.pluralsight.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
