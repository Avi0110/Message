package com.example.Motiiiii.repositories;

import com.example.Motiiiii.models.response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<response, Long> {
}
