package invernadero.el.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList
				ArrayList <Planta> plantas = new ArrayList<Planta>();
				ArrayList <Hierba> hierbas= new ArrayList<Hierba>();
				ArrayList <Mata> matas = new ArrayList<Mata>();
				ArrayList <Arbusto> arbustos = new ArrayList<Arbusto>();

				//Instancias
				
				Hierba c1 = new Hierba(85, 80, "Veza", "Violaceo");
				c1.setMetodos("aporta nitrogeno\n");
				Hierba c2 = new Hierba(123, 93, "Bledo", "Verde");
				c2.setMetodos("oxigena el cerebro\n");
				Hierba c3 = new Hierba(30, 50, "Albahaca", "Verde");
				c3.setMetodos("Alivia dolores\n");
				Hierba c4 = new Hierba(40, 30, "Cebolla", "Blanca");
				c4.setMetodos("Evita anemia\n");
				Hierba c5 = new Hierba(63, 70, "Cilantro", "Verde");
				c5.setMetodos("Estimula el intestino\n");
				Mata d1 = new Mata(180, 120.4, "Romero", "verde");
				d1.setMetodos("elimina la jaqueca\n");
				Mata d2 = new Mata(60, 40, "Tomillo", "Verde");
				d2.setMetodos("Reforzar las defensas\n");
				Mata d3 = new Mata(350, 9.2, "Lavanda", "Morada");
				d3.setMetodos("Mejorar el suelo\n");
				Mata d4 = new Mata(35, 150, "Salvia", "Morada");
				d4.setMetodos("Limpiador de catarros\n");
				Mata d5 = new Mata(48, 20, "Oregano", "verde");
				d5.setMetodos("Combatir la tos\n");
				Arbusto e1 = new Arbusto(180, 600.4, "Camelia", "Rosado");
				e1.setMetodos("Hidratada piel\n");											
				Arbusto e2 = new Arbusto(141, 300.7, "Celindo", "Blanco");
				e2.setMetodos("Decora\n");
				Arbusto e3 = new Arbusto(63, 580.3, "Alacaparra", "Verde");
				e3.setMetodos("Regulador sanguineo\n");
				Arbusto e4 = new Arbusto(120, 250, "Gardenia", "Verde");
				e4.setMetodos("Depurador\n");
				Arbusto e5 = new Arbusto(122, 280.1, "Hibisco", "Blanco");
				e5.setMetodos("combate la ansiedad\n");
				
				//Agregando arraylist
			
				hierbas.add(c1);
				hierbas.add(c2);
				hierbas.add(c3);
				hierbas.add(c4);
				hierbas.add(c5);
				matas.add(d1);
				matas.add(d2);
				matas.add(d3);
				matas.add(d4);
				matas.add(d5);
				arbustos.add(e1);
				arbustos.add(e2);
				arbustos.add(e3);
				arbustos.add(e4);
				arbustos.add(e5);
				
				Scanner scanear = new Scanner(System.in);
				String LNombre = "", LMetodos = "", LColor ="";
				int acceder, LTiempo, LAltura;
				do {
					System.out.println("//BIENVENIDO A LA APP DEL INVERNADERO \\");
					System.out.println("1. MOSTRAR HIERBAS\n2. MOSTRAR MATAS\n3.MOSTRAR ARBUSTOS");
					System.out.println("4. AGREGAR UNA NUEVO PLANTA\n0.SALIR");
					acceder = scanear.nextInt();
					
					switch(acceder) {
					case 1:
						System.out.println(c1);
						System.out.println(c2);
						System.out.println(c3);
						System.out.println(c4);
						System.out.println(c5);
						break;
					case 2:
						System.out.println(d1);
						System.out.println(d2);
						System.out.println(d3);
						System.out.println(d4);
						System.out.println(d5);
						break;
					case 3:
						System.out.println(e1);
						System.out.println(e2);
						System.out.println(e3);
						System.out.println(e4);
						System.out.println(e5);
						break;
					case 4:
						Scanner Scanear = new Scanner(System.in);
						System.out.print("Tiempo de Crecimiento (dias): ");
						LTiempo = Scanear.nextInt();
						System.out.print("Altura (cm): ");
						LAltura = Scanear.nextInt();
						System.out.print("Nombre: ");
						LNombre = Scanear.nextLine();
						System.out.print("Color de la Planta: ");
						LColor = Scanear.nextLine();
						System.out.println("\nEste pertenece a la especie de las: \n1. HIERBAS\n2.MATAS\n3.ARBUSTOS");
						acceder = scanear.nextInt();
						switch (acceder) {
						case 1:
							Hierba Lhierbas = new Hierba(LTiempo, LAltura, LNombre, LColor);
							Lhierbas.setMetodos(LMetodos);
							hierbas.add(Lhierbas);
						case 2: 
							Mata Lmatas = new Mata(LTiempo, LAltura, LNombre, LColor);
							Lmatas.setMetodos (LMetodos);
							matas.add(Lmatas);
						case 3:
							Arbusto Larbustos = new Arbusto(LTiempo, LAltura, LNombre, LColor);
							Larbustos.setMetodos(LMetodos);
							arbustos.add(Larbustos);
						default:
							System.out.println("Invalidado");
							break;
						}
						System.out.println(LNombre + "Ya fue agregado a la lista de los animales \n");
						break;
					case 0:
						System.out.println("Cierra el programa");
						break;
						default:
							System.out.println("Invalidado");
							break;
						
					}
				}while (acceder != 0);
				scanear.close();


	}

}
