package com.example.demo.Repository;

import com.example.demo.Entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
