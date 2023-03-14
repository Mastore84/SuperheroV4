package com.kea.projects.superherov4.dto;

import java.util.List;

public class SuperheroDTO {

    private int HERO_ID;
    private String HERO_NAME;
    private String REAL_NAME;
    private int CREATION_YEAR;
    private List<String> SUPERPOWERS;
    private int SUPERPOWERS_AMOUNT = SUPERPOWERS.size();
    private String CITY;
}