package com.atm;

public class Guiter {
    private  String serialNumber;
    private double price;
    private GuiterSpec spec;

    public Guiter(String serialNumber, double price,GuiterSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public GuiterSpec getSpec() {
        return spec;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Guiter: " +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", buidler='" + spec.getBuidler() + '\'' +
                ", model='" + spec.getModel() + '\'' +
                ", type='" + spec.getType() + '\'' +
                ", backWood='" + spec.getBackWood() + '\'' +
                ", topWood='" + spec.getTopWood() + '\'' +
                ", guiters=";
    }
}

