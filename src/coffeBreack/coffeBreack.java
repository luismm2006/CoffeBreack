package coffeBreack;

import java.util.Arrays;

public class coffeBreack {
	public static void main(String[] args) {
		MaquinaCafe maquina1 = new MaquinaCafe();
		maquina1.encender();
		maquina1.servirCafe();
		maquina1.mostrarInformacion();
		maquina1.mostrarVentas();
		MaquinaCafe maquina2 = new MaquinaCafe();
		maquina2.servirChocolate();
		maquina2.mostrarInformacion();
		maquina2.mostrarVentas();
		MaquinaCafe clonMaquina1 = new MaquinaCafe("1");
		System.out.println(maquina1.equals(clonMaquina1));
		System.out.println(maquina1.toString());
		MaquinaCafe[] conjuntoCafes = new MaquinaCafe[3];
		conjuntoCafes[0]=new MaquinaCafe();
		conjuntoCafes[1]=new MaquinaCafe();
		conjuntoCafes[2]=new MaquinaCafe();
		conjuntoCafes[0].setImporte(200);
		conjuntoCafes[1].setImporte(3);
		conjuntoCafes[2].setImporte(4000);
		Arrays.sort(conjuntoCafes);
		System.out.println();
	}
}
