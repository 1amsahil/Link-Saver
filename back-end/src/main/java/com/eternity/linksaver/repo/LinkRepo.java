package com.eternity.linksaver.repo;

import com.eternity.linksaver.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepo extends JpaRepository<Link, Integer> {
    List<Link> findByUserId(int userId);
}