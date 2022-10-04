package com.feign.passenger.model;

public class Passenger {
	private Long _id;
    private String name;
    private int trips;
    private Airline airline;
    private int __v;
	/**
	 * @return the _id
	 */
	public Long get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(Long _id) {
		this._id = _id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the trips
	 */
	public int getTrips() {
		return trips;
	}
	/**
	 * @param trips the trips to set
	 */
	public void setTrips(int trips) {
		this.trips = trips;
	}
	/**
	 * @return the airline
	 */
	public Airline getAirline() {
		return airline;
	}
	/**
	 * @param airline the airline to set
	 */
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	/**
	 * @return the __v
	 */
	public int get__v() {
		return __v;
	}
	/**
	 * @param __v the __v to set
	 */
	public void set__v(int __v) {
		this.__v = __v;
	}
   
}
