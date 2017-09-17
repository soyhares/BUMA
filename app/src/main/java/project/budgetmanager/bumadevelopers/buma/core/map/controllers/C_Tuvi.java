package project.budgetmanager.bumadevelopers.buma.core.map.controllers;

import java.util.ArrayList;

import project.budgetmanager.bumadevelopers.buma.core.map.data.C_Budget;
import project.budgetmanager.bumadevelopers.buma.core.map.data.C_Place;
import project.budgetmanager.bumadevelopers.buma.core.map.data.C_User;

/**
 * Viaje
 */

public class C_Tuvi {
    private double viatic;//presupuesto
    private C_User user;
    private String description;
    private ArrayList<project.budgetmanager.bumadevelopers.buma.core.map.data.C_Budget> expenseType;
    private ArrayList<project.budgetmanager.bumadevelopers.buma.core.map.data.C_Place> places;
    private boolean active=true;

    public C_Tuvi(double viatic, C_User user, String description, ArrayList<C_Budget> expenseType, ArrayList<C_Place> places, boolean active) {
        this.setViatic(viatic);
        this.setUser(user);
        this.setDescription(description);
        this.setExpenseType(expenseType);
        this.setPlaces(places);
        this.setActive(active);
    }

    public C_Tuvi() {

    }

    public double getViatic() {
        return viatic;
    }

    public void setViatic(double viatic) {
        this.viatic = viatic;
    }

    public C_User getUser() {
        return user;
    }

    public void setUser(C_User user) {
        this.user = user;
    }

    public String getDescription() { return description;    }

    public void setDescription(String description) { this.description = description; }

    public ArrayList<C_Budget> getExpenseType() {return expenseType;}

    public void setExpenseType(ArrayList<C_Budget> expenseType) {this.expenseType = expenseType; }

    public ArrayList<C_Place> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<C_Place> places) {
        this.places = places;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
