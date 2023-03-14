package com.kea.projects.superherov4.repositories;

import com.kea.projects.superherov4.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryDB implements IRepositoryInterface {

    @Value("${spring.datasource.url}")
    private String db_url;

    @Value("${spring.datasource.username}")
    private String uid;

    @Value("${spring.datasource.password}")
    private String pwd;

    @Override
    public List<Superhero> getAllCreationYear(){

        List<Superhero> superheroes = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(db_url, uid, pwd);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM SUPERHERO");
            ResultSet results = pstmt.executeQuery();
            if (results.next()) {
               int yearCreated = results.getInt("YEAR_CREATED");
               System.out.println(yearCreated);
            }
            con.close();
            return superheroes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Superhero> getSpecificCreationYear(String heroName){
        return null;
    }

    @Override
    public List<Superhero> getAllSuperpowersAmount() {
        return null;
    }

    @Override
    public List<Superhero> getSpecificSuperpowersAmount(String heroName){
        return null;
    }

    @Override
    public List<Superhero> getAllSuperpowers(){
        return null;
    }

    @Override
    public List<Superhero> getSpecificSuperpowers(String heroName){
        return null;
    }

    @Override
    public List<Superhero> getAllCity(){
        return null;
    }

    @Override
    public List<Superhero> getSpecificCity(String heroName){
        return null;
    }


    public String getMySQL(){
        try(Connection con = DriverManager.getConnection(db_url, uid, pwd)) {
            String SQL = "SELECT * FROM SUPERHEROES WHERE HERO_ID = ?";
            PreparedStatement pstmt = con.prepareStatement(SQL);
            pstmt.setInt(1,1);
            ResultSet result = pstmt.executeQuery();
            if (result.next());{
                System.out.println(result.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}