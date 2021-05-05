package com.codegym;

public class LazySingletonPattern {
    private LazySingletonPattern instance;

    private LazySingletonPattern() {
        this.instance = new LazySingletonPattern();
    }

    public LazySingletonPattern getInstance() {
        return instance;
    }
}
