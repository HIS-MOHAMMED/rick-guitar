package com.atm;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Inventory obj = new Inventory();
        obj.addGuiter("123",100,Builder.FENDER,"A12",Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD,NumString.EIGHT);
        obj.addGuiter("1234",200,Builder.FENDER,"A12",Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD, NumString.EIGHT);
        obj.addGuiter("12345",300,Builder.FENDER,"A12",Type.ELECTRIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD,NumString.SIX);
        obj.addGuiter("123456",400,Builder.ANY,"A12",Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD,NumString.TWELVE);

        GuiterSpec whatsErinLikes = new GuiterSpec(Builder.FENDER,"A12",Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD,NumString.EIGHT);
        List guiters = obj.searchForGuiter(whatsErinLikes);
        if(!guiters.isEmpty() ){
            System.out.println("There are exits guitars from this kind");
            for(Iterator i = guiters.iterator();i.hasNext(); ){
                Guiter guiter = (Guiter) i.next();
                System.out.println(guiter.toString());
            }
        }else System.out.println("Sorry, Erin we have nothing for you");
    }
}

