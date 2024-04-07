package org.udla.springbootjpahibernate.domain.entities.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@ToString
public class ClientModel {
    @Id
    private long id;
    private String name;
}
