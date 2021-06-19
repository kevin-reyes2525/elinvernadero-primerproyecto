package invernadero.el.com;

import invernadero.el2.com.Metodos;
import java.util.Scanner;

public abstract class Planta implements Metodos {
	
	public String name;
	public int tiempo;
	public double altura;
	public String color;
	public String Metodos1;
	
	
Scanner scanear = new Scanner(System.in);
	
	public Planta() {}
	
	public Planta (int tiempo, double altura, String name, String color) {
		this.tiempo = tiempo;
		this.altura = altura;
		this.name = name;
		this.color = color;
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMetodos() {
		return Metodos1;
	}
	public void setMetodos(String metodos1) {
		Metodos1 = metodos1;
	}

	public String toString() {
		return "Nombre de la Planta: " + getName() +  "\n" + "Tiempo de crecimiento de la planta (dias): " + getTiempo() + "\n" + "Altura de la planta (cm): " + getAltura() + "\n" +  "Color de la planta: " + getColor() +  "\n";
		
	}
	
	public abstract void mostrar();

}
