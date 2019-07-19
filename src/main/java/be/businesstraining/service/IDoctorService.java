package be.businesstraining.service;

import be.businesstraining.domain.Doctor;
import be.businesstraining.domain.Patient;

import java.util.Set;

public interface IDoctorService {

    Set<Doctor>getAllDoctors();
    Doctor getDoctorById(Long id);


}
