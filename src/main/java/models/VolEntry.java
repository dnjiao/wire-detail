package models;

public class VolEntry {
	private String volNumber;
	private String volName;
	private String county;
	private String state;
	private Double unit;
	private Double volumn;
	private Double net;
	
	public VolEntry(String volNumber, String volName, String county, String state, Double unit, Double volumn,
			Double net) {
		super();
		this.volNumber = volNumber;
		this.volName = volName;
		this.county = county;
		this.state = state;
		this.unit = unit;
		this.volumn = volumn;
		this.net = net;
	}
	public String getVolNumber() {
		return volNumber;
	}
	public void setVolNumber(String volNumber) {
		this.volNumber = volNumber;
	}
	public String getVolName() {
		return volName;
	}
	public void setVolName(String volName) {
		this.volName = volName;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getUnit() {
		return unit;
	}
	public void setUnit(Double unit) {
		this.unit = unit;
	}
	public Double getVolumn() {
		return volumn;
	}
	public void setVolumn(Double volumn) {
		this.volumn = volumn;
	}
	public Double getNet() {
		return net;
	}
	public void setNet(Double net) {
		this.net = net;
	}
}
