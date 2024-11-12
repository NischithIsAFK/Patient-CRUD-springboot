package com.nis.SpringBootPatientCRUD.service;

import com.nis.SpringBootPatientCRUD.model.Patient;
import com.nis.SpringBootPatientCRUD.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository repo;

    public List<Patient> getAllPatients(){
        return repo.getAllPatients();
    }

    public void addPatient(Patient patient){
        repo.addPatient(patient);
    }

    public Patient getPatient(int patientId) {
       return repo.getPatient(patientId);
    }

    public Patient updatePatient(Patient patient) {
        System.out.println("service called");
        return repo.updatePatient(patient);
    }

    public void deletePatient(int patientId) {
        repo.deletePatient(patientId);
    }
}
