package com.bd.web.services;

import com.bd.web.dtos.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}