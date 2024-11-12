package com.nis.SpringBootPatientCRUD.controller;

import com.nis.SpringBootPatientCRUD.model.Patient;
import com.nis.SpringBootPatientCRUD.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/")
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @PostMapping("/addPatient")
    public Patient addPatient(@RequestBody Patient patient){
        System.out.println("Controller called");
        patientService.addPatient(patient);
        return patientService.getPatient(patient.getId());
    }
    @GetMapping("/{patientId}")
    public Patient getPatient(@PathVariable("patientId") int patientId){
        return patientService.getPatient(patientId);
    }
    @PutMapping("/updatePatient")
    public Patient updatePatient(@RequestBody Patient patient){
        patientService.updatePatient(patient);
        return patientService.getPatient(patient.getId());
    }

    @DeleteMapping("{patientId}")
    public String deletePatient(@PathVariable("patientId") int patientId){
        patientService.deletePatient(patientId);
        return "patient deleted";
    }
}
