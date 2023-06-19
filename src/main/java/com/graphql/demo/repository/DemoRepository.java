package com.graphql.demo.repository;

import com.graphql.demo.entities.DemoTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<DemoTable, Integer> {
}
