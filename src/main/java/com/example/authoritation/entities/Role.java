package com.example.authoritation.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="role_seq_gen")
    @SequenceGenerator(name="role_seq_gen", sequenceName="ROLE_SEQ")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();
}
