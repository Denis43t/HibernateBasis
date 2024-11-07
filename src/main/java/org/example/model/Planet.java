package org.example.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Builder
@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Id
    private String id;
    @Column(length = 500)
    private String name;
}
