package com.codegym;

public class EagleSingletonPattern {
    private static final EagleSingletonPattern INSTANCE = new EagleSingletonPattern();

    private EagleSingletonPattern() {
    }

    public EagleSingletonPattern getInstance() {
        return INSTANCE;
    }
}
