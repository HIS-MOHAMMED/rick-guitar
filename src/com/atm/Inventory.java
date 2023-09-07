package com.atm;

import java.util.*;

public class Inventory {
    private List guiters;

    public Inventory() {
        guiters = new LinkedList();
    }

    public void addGuiter(String serialNumer, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood,NumString numStrings) {
        Guiter guiter = new Guiter(serialNumer,price,new GuiterSpec(builder,model,type,backWood,topWood,numStrings));
        guiters.add(guiter);
    }

    public Guiter getGuiter(String serialNumber) {
        for (Iterator i = guiters.iterator(); i.hasNext(); ) {
            Guiter guiter = (Guiter) i.next();
            if (guiter.getSerialNumber().equals(serialNumber)) {
                return guiter;
            }
        }
        return null;
    }
    public List searchForGuiter(GuiterSpec searchSpec) {
        List searchGuiters = new LinkedList();
        for (Iterator i = guiters.iterator(); i.hasNext(); ) {
            Guiter guiter = (Guiter) i.next();
            //ignore the serialnumber and price because they are unique.
            GuiterSpec guiterSpec = guiter.getSpec();
            if (guiterSpec.comparsion(searchSpec)) searchGuiters.add(guiter);
            else continue;
        }
        return searchGuiters;
    }
}
