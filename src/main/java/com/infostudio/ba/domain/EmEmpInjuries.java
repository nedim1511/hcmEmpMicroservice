package com.infostudio.ba.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A EmEmpInjuries.
 */
@Entity
@Table(name = "em_emp_injuries")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class EmEmpInjuries implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "id_employee")
    private EmEmployees idEmployee;

    @OneToOne
    @JoinColumn(name = "id_injury")
    private EmInjuryTypes idInjury;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public EmEmpInjuries description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EmEmployees getIdEmployee() {
        return idEmployee;
    }

    public EmEmpInjuries idEmployee(EmEmployees emEmployees) {
        this.idEmployee = emEmployees;
        return this;
    }

    public void setIdEmployee(EmEmployees emEmployees) {
        this.idEmployee = emEmployees;
    }

    public EmInjuryTypes getIdInjury() {
        return idInjury;
    }

    public EmEmpInjuries idInjury(EmInjuryTypes emInjuryTypes) {
        this.idInjury = emInjuryTypes;
        return this;
    }

    public void setIdInjury(EmInjuryTypes emInjuryTypes) {
        this.idInjury = emInjuryTypes;
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
        EmEmpInjuries emEmpInjuries = (EmEmpInjuries) o;
        if (emEmpInjuries.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), emEmpInjuries.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EmEmpInjuries{" +
            "id=" + getId() +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
