package gyan.sapient.footballleague.controller;


import gyan.sapient.footballleague.dto.TeamStandingDto;
import gyan.sapient.footballleague.log.annotation.Trace;
import gyan.sapient.footballleague.log.eventtype.LogEventType;
import gyan.sapient.footballleague.model.TeamStandingRequest;
import gyan.sapient.footballleague.service.TeamStandingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController {

  private final TeamStandingService teamStandingService;

  @Autowired
  public FootBallStandingController(
      TeamStandingService teamStandingService) {
    this.teamStandingService = teamStandingService;
  }

  @GetMapping
  @Trace(type = LogEventType.CONTROLLER)
  public ResponseEntity<TeamStandingDto> getStandings(@Valid TeamStandingRequest teamStandingRequest) {
    log.info("Request {}", teamStandingRequest.toString());
    return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
  }


}
