package com.freightez.www.base;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class FzAuditBase extends FzBase {
    private String name;

    private long createdById;
    private long createdTime;
    private long updatedById;
    private long updatedTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedById() {
        return createdById;
    }

    public void setCreatedById(long createdById) {
        this.createdById = createdById;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public long getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(long updatedById) {
        this.updatedById = updatedById;
    }

    public long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(long updatedTime) {
        this.updatedTime = updatedTime;
    }


}
