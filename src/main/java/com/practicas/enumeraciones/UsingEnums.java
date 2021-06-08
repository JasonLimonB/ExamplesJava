package com.practicas.enumeraciones;

public class UsingEnums {

    public String getDestinationSortTypeName(){
        return DestinationSortType.E.name();
    }

    public  String getDestinationSortTypeValue(){
        return DestinationSortType.E.getValue();
    }

    public String getServiceTypeCodeMnemonicTextName(){
        return ServiceTypeCodeMnemonicText.ONE_DA.name();
    }

    public String getServiceTypeCodeMnemonicTextValue(){
        return ServiceTypeCodeMnemonicText.ONE_DA.getValue();
    }

}
