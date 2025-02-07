package coffeBreack;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class MaquinaCafe implements Comparable<MaquinaCafe>{
	private String id;
	private static int counter;
	private double cafe;
	private double leche; 
	private double chocolate;
	private int cafeServidos;
	private int capuccinoSevidos;
	private int chocolatesServidos;
	private double importe;
	private LocalDateTime ultimoEncendido;
	
	public MaquinaCafe() {
		counter ++;
		this.id=Integer.toString(counter);
		rellenarDepositos();
	}
	public MaquinaCafe(String id) {
		this.id = id;
		rellenarDepositos();
	}
	public boolean apagar() {
		this.cafeServidos = 0;
		this.capuccinoSevidos = 0;
		this.chocolatesServidos = 0;
		this.importe = 0;
		this.ultimoEncendido = null;
		return true;
	}
	public boolean encender() {
		this.ultimoEncendido = LocalDateTime.now();
		return true;
	}
	public void rellenarDepositos() {
		this.cafe = 1.0;
		this.leche = 1.0;
		this.chocolate = 1.0;
	}
	public boolean servirCafe() {
		boolean resultado = false;
		if (this.cafe>0.005) {
			cafeServidos++;
			importe+=1.00;
			cafe-=0.005;
			resultado = true;
		}
		return resultado;
	}
	public boolean servirCapuccino() {
		boolean resultado = false;
		if (this.cafe>0.005 && this.chocolate>0.009 && this.leche>0.010) {
			capuccinoSevidos++;
			importe+=1.50;
			cafe-=0.005;
			chocolate-=0.009;
			leche-=0.010;
			resultado = true;
		}
		return resultado;
	}
	public boolean servirChocolate() {
		boolean resultado = false;
		if (this.chocolate>0.020 && this.leche>0.010) {
			chocolatesServidos++;
			importe+=0.90;
			chocolate-=0.020;
			leche-=0.010;
			resultado = true;
		}
		return resultado;
	}
	public double mostrarVentas() {
		System.out.println("Estas son las ventas de la máquina " + id + ":");
		System.out.println(" - Café: " + cafeServidos);
		System.out.println(" - Capuccino: " + capuccinoSevidos);
		System.out.println(" - Chocolate: " + chocolatesServidos);
		System.out.println(" - Importe total: " + importe);
		
		return 0.0;
	}
	public double mostrarInformacion() {
		System.out.println("Información de la máquina " + id + ":");
		System.out.println(" - Depósito de Café: " + cafe + " kg");
		System.out.println(" - Depósito de Leche: " + leche + " kg");
		System.out.println(" - Depósito de Chocolate: " + chocolate + " kg");		
		return 0.0;
	}
	@Override
	public boolean equals(Object otro) {
		boolean resultado = true;
		MaquinaCafe otraMaquinaCafe;
		try {
			otraMaquinaCafe = (MaquinaCafe)otro;
			resultado=otraMaquinaCafe.id.equals(this.id);
		}catch (Exception e) {
			resultado = false;
		}

		return resultado;
	}
	
	@Override
	public String toString() {
		return this.id;
	}
	
	@Override
	public int compareTo(MaquinaCafe otro) {
		return (int) (this.importe - ((MaquinaCafe)otro).importe);
	}
}
