package com.github.nildoeti.countries.repositories;

import com.github.nildoeti.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
