package com.bd.web.controllers;

import com.bd.web.services.ClubService;
import org.springframework.stereotype.Controller;

@Controller
public class ClubController {

    private ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }
}