package com.jetprogramming;

public class Camisa {

	private String color;

	private String talla;

	public Camisa(String color, String talla) {
		super();
		this.color = color;
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Camisa [color=" + color + ", talla=" + talla + "]";
	}

}
