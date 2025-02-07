package coffeBreack;

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
		MaquinaCafe primera = new MaquinaCafe();
		conjuntoCafes[0] 
	}
}
