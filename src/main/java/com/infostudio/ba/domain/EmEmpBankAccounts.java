package com.infostudio.ba.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A EmEmpBankAccounts.
 */
@Entity
@Table(name = "em_emp_bank_accounts")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class EmEmpBankAccounts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "id_bank")
    private Integer idBank;

    @OneToOne
    @JoinColumn(name = "id_employee")
    private EmEmployees idEmployee;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public EmEmpBankAccounts accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public EmEmpBankAccounts status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIdBank() {
        return idBank;
    }

    public EmEmpBankAccounts idBank(Integer idBank) {
        this.idBank = idBank;
        return this;
    }

    public void setIdBank(Integer idBank) {
        this.idBank = idBank;
    }

    public EmEmployees getIdEmployee() {
        return idEmployee;
    }

    public EmEmpBankAccounts idEmployee(EmEmployees emEmployees) {
        this.idEmployee = emEmployees;
        return this;
    }

    public void setIdEmployee(EmEmployees emEmployees) {
        this.idEmployee = emEmployees;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmEmpBankAccounts emEmpBankAccounts = (EmEmpBankAccounts) o;
        if (emEmpBankAccounts.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), emEmpBankAccounts.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EmEmpBankAccounts{" +
            "id=" + getId() +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", status='" + getStatus() + "'" +
            ", idBank=" + getIdBank() +
            "}";
    }
}
