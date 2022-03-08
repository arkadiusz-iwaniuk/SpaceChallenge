package com.isa.ehj1;

public class Rocket implements SpaceShip {

    int cost;
    int weight;
    int maxWeight;
    double launchExplosion;
    double landingCrash;
    int currentWeight;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {
        return this.currentWeight + item.getWeight() <= maxWeight;
    }

    public int carry(Item item) {
        this.currentWeight += item.getWeight();
        return this.currentWeight;
    }
}
