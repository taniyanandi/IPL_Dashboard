package com.ipl_dashboard.ipl_dashboard.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ipl_dashboard.ipl_dashboard.model.Match;
import com.ipl_dashboard.ipl_dashboard.repository.MatchRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MatchController {

    @Autowired
    MatchRepository matchRepository;

    @GetMapping("/{PlayerOfMatch}")
    public List<Match> getPlayerOfMatch(@PathVariable String PlayerOfMatch) {
         return matchRepository.findByPlayerOfMatch(PlayerOfMatch);
    }
    

}
