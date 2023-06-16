package com.freightez.www.entity;

import com.freightez.www.base.FzAuditBase;
import com.freightez.www.enums.FzUserType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import java.util.Set;

@Entity
public class FzUser extends FzAuditBase {
    @Column(unique = true)
    private String email;
    private FzUserType fzUserType;
    private String contactNo;
    private String phoneNo;
    private String passwordEncrypted;
    @ElementCollection(targetClass = Long.class, fetch = FetchType.EAGER)
    private Set<Long> roles;
    @ElementCollection(targetClass = Long.class, fetch = FetchType.EAGER)
    private Set<Long> companyIds;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FzUserType getFzUserType() {
        return fzUserType;
    }

    public void setFzUserType(FzUserType fzUserType) {
        this.fzUserType = fzUserType;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }

    public Set<Long> getRoles() {
        return roles;
    }

    public void setRoles(Set<Long> roles) {
        this.roles = roles;
    }

    public Set<Long> getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(Set<Long> companyIds) {
        this.companyIds = companyIds;
    }
}
