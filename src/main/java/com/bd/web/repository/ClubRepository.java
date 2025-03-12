package com.bd.web.repository;

import com.bd.web.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {

    Optional<Club> findClubByContent(String aLong);
}
