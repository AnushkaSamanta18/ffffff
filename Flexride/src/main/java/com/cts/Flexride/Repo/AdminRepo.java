package com.cts.Flexride.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.Flexride.Entity.AdminEntity;

@Repository
public interface AdminRepo extends JpaRepository<AdminEntity, Integer>{

}
