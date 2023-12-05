package com.example.Mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "listing")
public class Listing {

   private String profile;
   private String desc;
   private int experience;
   private List<String> techs;

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", desc='" + desc + '\'' +
                ", experience=" + experience +
                ", techs=" + techs +
                '}';
    }

    public Listing() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<String> getTechs() {
        return techs;
    }

    public void setTechs(List<String> techs) {
        this.techs = techs;
    }
}
