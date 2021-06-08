package com.practicas.enumeraciones;

public enum ServiceTypeCodeMnemonicText {
    ONE_DA("1DA"),
    TWO_DA("2DA"),
    THREE_DS("3DS"),
    GND("GND"),
    GRD("GRD"),
    EAM("EAM"),
    DH1("DH1"),
    DH2("DH2"),
    E("E"),
    G("G"),
    THREE("3"),
    N("N"),
    S("S"),
    I("I");

    private String value;

    ServiceTypeCodeMnemonicText(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
