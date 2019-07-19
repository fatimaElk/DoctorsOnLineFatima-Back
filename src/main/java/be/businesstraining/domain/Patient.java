package be.businesstraining.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="patients")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Patient  {//extends Personne

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    @Column(unique = true)
    private String email;
    @JsonIgnore
    @ManyToOne
    private Doctor doctor;
}
