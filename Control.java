/**
 * 
 */

/**
 * @author Laptop
 *
 */
public class Control implements CRadio{
	
	double[] arrAm;
	double[] arrFm;
	
	public Control(){
		arrAm = new double[12];
		arrFm = new double[12];
	}

	@Override
	public String cambiarAm() {
		return "AM";
	}

	@Override
	public String cambiarFm() {
		return "FM";
	}

	@Override
	public boolean cambiarAmFm(String AmFm) {
		if(AmFm.equals("AM")){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean encendido() {
		return false;
	}

	@Override
	public void guardar(int boton, double estacion, double[] estaciones) {
			estaciones[boton] = estacion;
	}

	@Override
	public double seleccionar(int boton, double estacion, double[] estaciones) {
		return estaciones[boton];
	}

	@Override
	public double estacion(boolean AmFm, boolean boton, double estacion) {
		if(AmFm == true){
			if(boton == true){
				if(estacion < 1610){
					estacion = Math.round((estacion + 10));
				}
				else{
					estacion = 530;
				}
			}
			else{
				if(estacion > 530){
					estacion = Math.round((estacion - 10));
				}
				else{
					estacion = 1610;
				}
			}
		}
		else{
			if(boton == true){
				if(estacion < 107.9){
					estacion = Math.round((estacion + 0.2) * 10) / 10.0;
				}
				else{
					estacion = 87.9;
				}
			}
			else{
				if(estacion > 87.9){
					estacion = Math.round((estacion - 0.2) * 10) / 10.0;
				}
				else{
					estacion = 107.9;
				}
			}
		}
		return estacion;
	}

}
