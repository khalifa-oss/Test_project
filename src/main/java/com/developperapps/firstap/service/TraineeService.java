package com.developperapps.firstap.service;

import com.developperapps.firstap.model.Trainee;
import com.developperapps.firstap.repository.TraineeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TraineeService {
    private TraineeRepository traineeRepository;
     public Trainee create(Trainee trainee){
         return traineeRepository.save(trainee);

     }

}
