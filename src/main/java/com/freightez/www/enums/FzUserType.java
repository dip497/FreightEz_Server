package com.freightez.www.enums;

public enum FzUserType {
    CUSTOMER(0),

    OWNER(1),

    DRIVER(2);

    private final int id;

    FzUserType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
