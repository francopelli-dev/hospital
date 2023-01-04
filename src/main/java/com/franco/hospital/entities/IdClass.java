package com.franco.hospital.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IdClass {
    @GeneratedValue
    @Id
    Long id;
}
