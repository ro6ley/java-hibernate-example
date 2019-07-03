package com.stackabuse.hibernatedemo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Phone repository.
 *
 * @author Robley Gori - ro6ley.github.io
 */
public interface PhoneRepository extends JpaRepository<Phone, Long> {
  
}
