package com.franco.hospital.entities;

import javax.persistence.Entity;

@Entity
public class User extends IdClass {

    private String username;

    private String pwr;

    private Enum<UserType> type;

}
