package com.nis.SpringBootPatientCRUD.repo;

import com.nis.SpringBootPatientCRUD.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {
    List<Patient> patients=new ArrayList<>();

    public PatientRepository(){
        patients.add(new Patient(1, "Akil", "bangalore", 19,
                List.of("Diarrhea", "Migrane", "Leg pain")));

        // Frontend Developer Job Post
        patients.add(new Patient(2, "Balu", "Lucknow", 29,
                List.of("Cancer", "Headache", "Leg pain")));
    }


    public List<Patient> getAllPatients() {
        return patients;
    }

    public void addPatient(Patient patient){
        System.out.println("repo called");
        patients.add(patient);
    }

    public Patient getPatient(int patientId) {
        for(Patient patient:patients){
            if(patient.getId()==patientId){
                return patient;
            }
        }
        return null;
    }

    public Patient updatePatient(Patient patient) {
        for(Patient patient1:patients){
            if(patient1.getId()==patient.getId()){
                patient1.setPatientName(patient.getPatientName());
                patient1.setPatientPlace(patient.getPatientPlace());
                patient1.setPatientAge(patient.getPatientAge());
                patient1.setDiseases(patient.getDiseases());
            }
        }
        return patient;
    }

    public void deletePatient(int patientId) {
        for(Patient patient:patients){
            if(patient.getId()==patientId){
                patients.remove(patient);
            }
        }
    }
}
