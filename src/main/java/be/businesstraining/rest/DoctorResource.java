package be.businesstraining.rest;

import be.businesstraining.domain.Doctor;
import be.businesstraining.service.IDoctorService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@CrossOrigin
@RestController
@RequestMapping("/doctors")//ou name=" "
@AllArgsConstructor
public class DoctorResource {

    private IDoctorService iDoctorService;


    @GetMapping//pas d'ajout url reste /doctors =ENDPOINT
    public Set<Doctor> allDoctors() {
        return iDoctorService.getAllDoctors();
    }

    @GetMapping(path = "/{id}")//
    public Doctor getDoctorById(@PathVariable Long id) {//si pas même nom le préciser ds @PathVariable("autreNom")
        return iDoctorService.getDoctorById(id);
    }


}
