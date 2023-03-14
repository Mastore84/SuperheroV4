package com.kea.projects.superherov4.model;

public class Superhero {

    //fields
    private String heroName;
    private String realName;
    private int creationYear;
    private String superpowerName;
    private String cityName;

    //constructor
    public Superhero(String heroName,
                     String realName,
                     int creationYear,
                     String superpowerName,
                     String cityName) {
        this.heroName = heroName;
        this.realName = realName;
        this.creationYear = creationYear;
        this.superpowerName = superpowerName;
        this.cityName = cityName;
    }

    //getters and setters
    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public String getSuperpowerName() {
        return superpowerName;
    }

    public void setSuperpowerName(String superpowerName) {
        this.superpowerName = superpowerName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", creationYear=" + creationYear +
                ", superpowerName='" + superpowerName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
