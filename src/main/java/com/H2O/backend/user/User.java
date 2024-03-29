package com.H2O.backend.user;

import com.H2O.backend.reservation.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id"})})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no") private Long userNo;
    @Column(name = "user_id", nullable = false) private String userId;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "password", nullable = false) private String password;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "admin_check", nullable = false, columnDefinition = "boolean default 0") private Integer adminCheck;
    @Column(name = "email", nullable = false) private String email;
    @Column(name = "history") private String history;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Reservation> reservation;

    @Builder
    public User(String userId, String name, String password, String phone, int adminCheck, String email, String history){
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.adminCheck = adminCheck;
        this.email = email;
        this.history = history;
    }


}
