package com.SportyShoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SportyShoes.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
