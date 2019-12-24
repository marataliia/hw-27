package com.company;


abstract class AbstractLocality {
    private String name;
    private Mayor mayor;
    private int population;


    public AbstractLocality(String name, Mayor mayor, int population) {
        this.name = name;
        this.mayor = mayor;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mayor getMayor() {
        return mayor;
    }

    public void setMayor(Mayor mayor) {
        this.mayor = mayor;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
