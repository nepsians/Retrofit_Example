package com.example.nihal.retrofitapp;

public class Hero {

    String name;
    String realname;
    String team;
    String firstappearance;

    Hero (String name,String realname,String team,String firstappearance){
        this.name=name;
        this.team=team;
        this.realname=realname;
        this.firstappearance=firstappearance;
    }

    public String getName(){
        return name;
    }

    public String getRealname() {
        return realname;
    }
    public String getTeam(){
        return team;
    }
    public String getFirstappearance(){
        return firstappearance;
    }
}
