package com.company;

public class Main {

    public static void main(String[] args) {
        District [] BDistricts = new District[3];
        BDistricts [0] = new District("Свердловский");
        BDistricts [1] = new District("Первомайский");
        BDistricts [2] = new District("Ленинский");
        BDistricts [3] = new District("Октябрьский");

        District [] NDistricts = new District[4];
        NDistricts [0] = new District("Ак-Талинский");
        NDistricts [1] = new District("Ат-Башинский");
        NDistricts [2] = new District("Жумгальский");
        NDistricts [3] = new District("Кочкорский");
        NDistricts [4] = new District("Нарынский");


       Mayor BMayor = new Mayor("Азиз Суракматов");
       Mayor NMayor = new Mayor("Нурбек Молдокадыров");
       Mayor BatkenMayor = new Mayor("Исманали Жумабаевич");
       Mayor NookatMayor = new Mayor ("Давран Маметалиевич");
       Mayor KSMayor = new Mayor("Тилек Матраимов");



        City Bishkek = new City("Бишкек", BMayor, 1027200, BDistricts);
        City Naryn = new City("Нарын", NMayor, 40000, NDistricts);
        Village Janyjer = new Village("Жаны жер", BatkenMayor, 1150);
        Village Nookat = new Village("Ноокат", NookatMayor, 14731);
        Village KaraSuu = new Village("Кара-Суу", KSMayor, 26000);










    }
}
