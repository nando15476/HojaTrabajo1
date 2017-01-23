import java.util.Scanner;

/**
 * 
 */

/**
 * @author Laptop
 *
 */
public class RadioPrincipal {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Radio miRadio = new Radio();
		int x = 1;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("*-----------------------------------------------------------*\nBienvenido a la radio\n");
		System.out.println(Instrucciones() + "\n");
		System.out.println(EstacionActual(miRadio.getStation() + miRadio.getFrecuency()));
		while(x == 1){
			String input = teclado.nextLine();
			if(input.toLowerCase().equals("instrucciones"))
				System.out.println(Instrucciones());
			
			else if(input.toUpperCase().equals("AM") || input.toUpperCase().equals("FM")){
				if(input.toUpperCase().equals(miRadio.getFrecuency()) == false)
					miRadio.changeFrecuency();
				System.out.println(FrecuenciaActual(miRadio.getFrecuency()));
			}
			
			else if(input.toLowerCase().equals("apagar") || input.toLowerCase().equals("encender")){
				if((miRadio.isOn() == true && input.toLowerCase().equals("encender")) 
						|| ((miRadio.isOn() == false && input.toLowerCase().equals("apagar"))))
					miRadio.OnOff();
				if((miRadio.isOn() == true)){
					System.out.println("La radio esta apagada");
					int y = 1;
					while(y == 1){
						if(teclado.nextLine().toLowerCase().equals("encender")){
							System.out.println("La radio esta encendida");
							System.out.println("*-----------------------------------------------------------*\nBienvenido a la radio\n");
							y = 0;
							x = 1;
						}
						else{
							y = 1;
							System.out.println("La radio esta apagada");
						}
					}
				}
				else
					System.out.println("La radio esta encendida");
			}
			
			else if(input.toLowerCase().equals("mas") || input.equals("+")){
				miRadio.Forward();
				System.out.println(EstacionActual((Math.round(Float.parseFloat(miRadio.getStation()) * 10) / 10.0) + miRadio.getFrecuency()));
			}
			
			else if(input.toLowerCase().equals("menos") || input.equals("-")){
				miRadio.Backward();
				System.out.println(EstacionActual((Math.round(Float.parseFloat(miRadio.getStation()) * 10) / 10.0) + miRadio.getFrecuency()));
			}
			
			else if(input.toLowerCase().equals("guardar1") || input.toLowerCase().equals("guardar2") || input.toLowerCase().equals("guardar3") || 
					input.toLowerCase().equals("guardar4") || input.toLowerCase().equals("guardar5") || input.toLowerCase().equals("guardar6") || 
					input.toLowerCase().equals("guardar7") || input.toLowerCase().equals("guardar8") || input.toLowerCase().equals("guardar9") || 
					input.toLowerCase().equals("guardar10") || input.toLowerCase().equals("guardar11") || input.toLowerCase().equals("guardar12")){
				if(miRadio.Memorias[Integer.parseInt(input.substring(7)) - 1] == null){
					miRadio.setMemory(Integer.parseInt(input.substring(7)) - 1);
					System.out.println("Estacion guardada en PreSet " + Integer.parseInt(input.substring(7)));
				}
				else{
					System.out.println("Este PreSet ya tiene una estacion guardada, desea sobreescribirlo? si/no");
					if(teclado.nextLine().toLowerCase().equals("si")){
						miRadio.setMemory(Integer.parseInt(input.substring(7)) - 1);
						System.out.println("Estacion guardada en PreSet " + Integer.parseInt(input.substring(7)));
					}
				}
			}
			else if(input.toLowerCase().equals("seleccionar1") || input.toLowerCase().equals("seleccionar2") || input.toLowerCase().equals("seleccionar3") || 
					input.toLowerCase().equals("seleccionar4") || input.toLowerCase().equals("seleccionar5") || input.toLowerCase().equals("seleccionar6") || 
					input.toLowerCase().equals("seleccionar7") || input.toLowerCase().equals("seleccionar8") || input.toLowerCase().equals("seleccionar9") || 
					input.toLowerCase().equals("seleccionar10") || input.toLowerCase().equals("seleccionar11") || input.toLowerCase().equals("seleccionar12")){
				if(miRadio.Memorias[Integer.parseInt(input.substring(11)) - 1] == null)
					System.out.println("El PreSet que escogio no tiene nada guardado");
				else{
					miRadio.frecuency = miRadio.Memorias[Integer.parseInt(input.substring(11)) - 1].frecuency;
					miRadio.station = miRadio.Memorias[Integer.parseInt(input.substring(11)) - 1].station;
					System.out.println(FrecuenciaActual(miRadio.getFrecuency() + "\n" + EstacionActual(miRadio.getStation())));
				}
			}
			else
				System.out.println("Este comando no existe, reevise lo que escribio");
		}
	}
	
	public static String Instrucciones(){
		return "Instrucciones\n\nEscriba la palabra \"mas\", o ingrese el simbolo \"+\" \npara subir de estacion"
				+ "\nEscriba la palabra \"menos\", o ingrese el simbolo \"-\" \n\npara bajar de estacion\n\nPara cambiar entre estaciones"
				+ " AM y FM,\nsimplemente ingrese \"AM\" o \"FM\"\n\nPara guardar una estacion en uno de los 12 PreSets, escriba \"guardar\"\n"
				+ "seguido de el numero de PreSet en el que lo desea guardar\nEjemplo:\nguardar3\nEn este caso la estacion actual se "
				+ "guardara en el PreSet numero 3\nNota: Si el PreSet en el que desea guardar la estacion ya tiene algo guardado, "
				+ "\nun mensaje de opcion se le presentara\n\nPara seleccionar una estacion guardada, escriba la palabra \"usar\"\nseguido del"
				+ "numero de PreSet que desea usar\nEjemplo:\nusar3\nEn este caso lo que este guardado en el PreSet3\nNota: Si el PreSet que"
				+ "desea usar no tiene nada guardado, un mensaje de\nadvertencia se le presentara\nNota: Tome en cuenta que solo hay 12 PreSets"
				+ "\n\nPara apagar o encender la radio, esctiba \"encender\" o \"apagar\"\n\nPara ver la estacion actual escriba \"estacion\""
				+ "\n\nPara volver a ver estas instrucciones escriba \"instrucciones\"";
	}
	
	public static String EstacionActual(String estacion){
		return "La estacion actual es " + estacion;
	}
	
	public static String FrecuenciaActual(String frecuencia){
		return "La frecuencia actual es " + frecuencia;
	}
}
