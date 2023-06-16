package com.freightez.www.base;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class FzBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
