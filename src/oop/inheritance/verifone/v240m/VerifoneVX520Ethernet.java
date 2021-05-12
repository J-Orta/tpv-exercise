package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneVX520Ethernet {

    private static VerifoneVX520Ethernet uniqueInstance;

    private VerifoneVX520Ethernet() {

    }

    public static VerifoneVX520Ethernet getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVX520Ethernet();
        }
        return uniqueInstance;
    }
    public Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

}
