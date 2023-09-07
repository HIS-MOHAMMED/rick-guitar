package com.atm;

public class GuiterSpec {
    private Builder buidler;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private NumString numStrings;


    public GuiterSpec(Builder buidler, String model, Type type, Wood backWood, Wood topWood,NumString numStrings) {
        this.buidler = buidler;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuidler() {
        return buidler;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public NumString getNumStrings() {
        return numStrings;
    }
    public Boolean comparsion(GuiterSpec guiterSpec){
        if(this.getBuidler() == guiterSpec.getBuidler()){
            if(this.getType() == guiterSpec.getType()){
                if(this.getTopWood() == guiterSpec.getTopWood())
                    if(this.getBackWood() == guiterSpec.getBackWood()){
                        if(this.getModel() != null && !this.getModel().equals("") && this.model == guiterSpec.getModel()){
                            if(this.getNumStrings() == guiterSpec.getNumStrings()){
                                return true;
                            }
                        }
                    }
            }

        }
        return false;
    }
}
