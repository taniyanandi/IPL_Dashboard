package com.ipl_dashboard.ipl_dashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ipl_dashboard.ipl_dashboard.model.Match;
import com.ipl_dashboard.ipl_dashboard.model.Team;

@Repository
public interface TeamRepository  extends CrudRepository<Team, Long>{

    Team findByTeamName(String teamName);
    List<Team>  findAll();
    
   
    

}
