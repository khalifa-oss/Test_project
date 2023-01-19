package com.developperapps.firstap.controller;

import com.developperapps.firstap.model.Trainee;
import com.developperapps.firstap.service.TraineeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/trainee")
public class TraineeController {
    private TraineeService traineeService;
    @PostMapping("/add")
    public ResponseEntity<Trainee> CreateTrainee(@RequestBody Trainee trainee){
    Trainee response=    traineeService.create(trainee);
        return  new ResponseEntity(response,HttpStatus.CREATED);
    }

}
