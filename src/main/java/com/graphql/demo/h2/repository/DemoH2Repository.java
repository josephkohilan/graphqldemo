package com.graphql.demo.h2.repository;

import com.graphql.demo.h2.entities.DemoTableH2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoH2Repository extends JpaRepository<DemoTableH2, Integer> {
}
