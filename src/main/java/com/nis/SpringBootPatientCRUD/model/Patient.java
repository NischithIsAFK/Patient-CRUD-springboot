package com.nis.SpringBootPatientCRUD.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class Patient {
    int id;
    String patientName;
    String patientPlace;
    int patientAge;
    List<String> diseases;

}
