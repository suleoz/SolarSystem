package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda=new SolarSystem();
        andromeda.planet=2;
        andromeda.Sun=1;
        andromeda.moon=4;

        featureSun mikasun=new featureSun();
        mikasun.color="Red";
        mikasun.heat="86056220074kj";
        mikasun.temp="640087K";
        mikasun.radius="860,511km";
        mikasun.martialStatus="double";


        //adding Planet2
        Planet2 brasto=new Planet2();
        brasto.color="grey";
        brasto.size=23444;
        brasto.relationship="in relation";

        //addind planet 1
        Planet1 astranot=new Planet1();
        astranot.size=333333;
        astranot.color="blue";
        astranot.relationship="single";



    }
}
