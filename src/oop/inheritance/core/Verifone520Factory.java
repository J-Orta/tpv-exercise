package oop.inheritance.core;

import oop.inheritance.verifone.vx520.VerifoneVx520Display;
import oop.inheritance.verifone.vx520.VerifoneVx520Keyboard;
import oop.inheritance.verifone.vx520.VerifoneVx520Printer;
import oop.inheritance.verifone.vx520.VerifoneVx520CardSwipper;
import oop.inheritance.verifone.vx520.VerifoneVx520ChipReader;
import oop.inheritance.verifone.vx520.VerifoneVx520Ethernet;

public class Verifone520Factory extends TPVAbstractFactory {
    @Override
    public TPVDisplay getDisplay() {
        return new VerifoneVx520Display();
    }

    @Override
    public TPVKeyboard getKeyboard() {
        return new VerifoneVx520Keyboard();
    }

    @Override
    public TPVPrinter getPrinter() {
        return new VerifoneVx520Printer();
    }

    @Override
    public TPVCardSwipper getCardSwipper() {
        return new VerifoneVx520CardSwipper();
    }

    @Override
    public TPVChipReader getChipReader() {
        return new VerifoneVx520ChipReader();
    }

    @Override
    public TPVEthernet getEthernet() {
        return new VerifoneVx520Ethernet();
    }


}
