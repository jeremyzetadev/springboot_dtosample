package com.sample.DTOsample.repository;

import com.sample.DTOsample.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
