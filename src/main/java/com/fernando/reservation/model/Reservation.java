/**
 * 
 */
package com.fernando.reservation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Fernando Ambrosio
 * @since 19 of july 2020
 *
 */
@Data
@Entity
@Table(name = "reservation", schema = "reservation")
public class Reservation implements Serializable {

	private static final long serialVersionUID = 8278617654074398985L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date entryReservation;
	private Date outputReservation;
	private int quantityPeopleReservation;
	private String descriptionReservation;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCustomer")
	private Customer customer;

	public Reservation() {

	}

}
