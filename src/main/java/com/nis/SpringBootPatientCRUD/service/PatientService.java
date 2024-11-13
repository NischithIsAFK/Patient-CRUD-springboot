package com.nis.SpringBootPatientCRUD.service;

import com.nis.SpringBootPatientCRUD.model.Patient;
import com.nis.SpringBootPatientCRUD.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository repo;

    public List<Patient> getAllPatients(){
        return repo.findAll();
    }

    public void addPatient(Patient patient){
        repo.save(patient);
    }

    public Patient getPatient(int patientId) {
       return repo.findById(patientId).orElse(new Patient());
    }

    public Patient updatePatient(Patient patient) {
        System.out.println("service called");
        return repo.save(patient);
    }

    public void deletePatient(int patientId) {
        repo.deleteById(patientId);
    }

    public void load() {

    List<Patient> patients=new ArrayList<>(List.of(
        new Patient(1, "Akil", "bangalore", 19,
                List.of("Diarrhea", "Migrane", "Leg pain")),

        // Frontend Developer Job Post
        new Patient(2, "Balu", "Lucknow", 29,
                List.of("Cancer", "Headache", "Leg pain"))
        ));
        repo.saveAll(patients);
    }

}
