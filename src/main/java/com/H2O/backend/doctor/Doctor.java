package com.H2O.backend.doctor;

import com.H2O.backend.hospital.Hospital;
import com.H2O.backend.reservation.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@Component
@NoArgsConstructor
@Table(name="doctor", uniqueConstraints={@UniqueConstraint(columnNames = {"doctors_license"})})
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doctor_no") private Long doctorNo;
    @Column(name = "doctors_license", nullable = false) private String doctorsLicense;
    @Column(name = "doctor_name") private String doctorName;
    @Column(name = "hospital_name") private String hospitalName;
    @Column(name = "position", nullable = false) private String position;
    @Column(name = "detail_data", nullable = false) private String detailData;
    @Column(name = "specialized", nullable = false) private String specialized;
    @Column(name = "medical_subject", nullable = false) private String medicalSubject;
    @Column(name = "birthday", nullable = false) private String birthday;

    @Builder
    public Doctor(String doctorName,
                  String doctorsLicense,
                  String hospitalName,
                  String position,
                  String detailData,
                  String specialized,
                  String medicalSubject,
                  String birthday){
        this.doctorName = doctorName;
        this.hospitalName= hospitalName;
        this.position = position;
        this.detailData = detailData;
        this.specialized = specialized;
        this.medicalSubject = medicalSubject;
        this.birthday = birthday;
        this.doctorsLicense = doctorsLicense;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="hospital_no")
    private Hospital hospital;

    @JsonIgnore
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}