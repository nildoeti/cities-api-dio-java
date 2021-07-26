package com.github.nildoeti.staties.repositories;

import com.github.nildoeti.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
