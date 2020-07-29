package com.fernando.reservation.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Fernando Ambrosio
 * @since 10 of july 2020
 *
 */
@Data
@Entity
@Table(name = "customer", schema = "reservation")
@NamedQuery(name = "Customer.findByIdentification", query = "SELECT c FROM Customer c WHERE.identificationCustomer = ?1")
public class Customer implements Serializable {

	private static final long serialVersionUID = 8724307691593812378L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;
	private String lastCustomer;
	private String nameCustomer;
	@Column(unique = true)
	private String identificationCustomer;
	private String addressCustomer;
	private String phoneCustomer;
	@Column(unique = true, nullable = false)
	private String emailCustomer;

	@OneToMany(mappedBy = "customer")
	private List<Reservation> reservations;

	public Customer() {

	}

}
