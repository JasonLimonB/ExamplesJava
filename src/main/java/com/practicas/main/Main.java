package com.practicas.main;

import com.practicas.enumeraciones.DestinationSortType;
import com.practicas.enumeraciones.ServiceTypeCodeMnemonicText;

public class Main {
    public static void main(String[] args) {

        DestinationSortType type = DestinationSortType.M;
        System.out.println(type.getValue());

        ServiceTypeCodeMnemonicText serviceType = ServiceTypeCodeMnemonicText.ONE_DA;
        System.out.println(serviceType.getValue());
    }
}
