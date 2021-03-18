package com.SportyShoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SportyShoes.model.NewUserRegistration;

public interface NewUserRegistrationRepository extends JpaRepository<NewUserRegistration, Integer> {

}
