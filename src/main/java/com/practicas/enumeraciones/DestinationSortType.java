package com.practicas.enumeraciones;

public enum DestinationSortType {
    // We can change A to AFTERNOON and gets the value like A

    A("AFTERNOON"),
    C("CPU_CENTRAL_PICK_UP"),
    D("DAY"),
    E("EMPTY"),
    L("LOCAL"),
    M("MORNING"),
    N("NIGHT"),
    P("PRELOAD"),
    S("SUNRISE"),
    T("TWILIGHT");

    private String value;

    DestinationSortType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
