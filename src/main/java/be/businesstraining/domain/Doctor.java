package be.businesstraining.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Doctors")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {// extends Personne

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    @Column(unique = true)
    private String email;
    private String picture;
    @OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
    private Set<Patient>listPatient;



}
