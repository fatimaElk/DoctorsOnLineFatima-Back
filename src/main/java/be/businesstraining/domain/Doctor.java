package be.businesstraining.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Doctors")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {
    @Id
    private Long id;
    private String lastName;
    private String firstName;
    @Column(unique = true)
    private String email;


}
