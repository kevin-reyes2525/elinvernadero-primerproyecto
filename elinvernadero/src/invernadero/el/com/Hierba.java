package invernadero.el.com;

public class Hierba extends Planta {
	
	public Hierba() {
		super();
	}
	public Hierba(int tiempo, double altura, String name, String color) {
		super(tiempo, altura, name, color);
	}
	
	public String toString() {
		return "Metodos: " + super.getMetodos() + super.toString();
	}
	@Override
	public void mostrar() {
		System.out.println("\nNombre de la Planta: " + getName() +  "\n" + "Tiempo de crecimiento de la planta (dias): " + getTiempo() + "\n" + "Altura de la planta (cm): " + getAltura() + "\n" +  "Color de la Planta: " + getColor() +  "\n");

}
}
