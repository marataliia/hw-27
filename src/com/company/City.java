package com.company;

public class City extends AbstractLocality {
    private District district[];

    public City(String name, Mayor mayor, int population, District[] district) {
        super(name, mayor, population);
        this.district = district;
    }

    public District[] getDistrict() {
        return district;
    }

    public void setDistrict(District[] district) {
        this.district = district;
    }

    public District getDistrict(int index) {
        if (index < 0 || index > district.length) return null;
        return district[index];
    }

    public String findMayor(String name) {
        if (name == "Азиз Суракматов") {
            return "Бишкек";
        } else if (name == "Нурбек Молдокадыров") {
            return "Нарын";
        }

        return null;
    }
}
