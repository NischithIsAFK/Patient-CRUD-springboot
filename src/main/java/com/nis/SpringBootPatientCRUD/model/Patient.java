package com.nis.SpringBootPatientCRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Component

public class Patient {
    @Id
    int id;
    String patientName;
    String patientPlace;
    int patientAge;
    List<String> diseases;

}
