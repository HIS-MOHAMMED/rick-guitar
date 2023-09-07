package com.atm;


public enum NumString {
    SIX(1),
    TWELVE(12),
    FOUR(4),
    EIGHT(8);

    private int value;
    NumString(int value){
        this.value = value;
    }
    public String toString(){
        switch (this){
            case SIX : return "6";
            case TWELVE: return "12";
            case FOUR: return "4";
            case EIGHT: return "8";
            default: return "0";
        }
    }
}
