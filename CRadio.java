/**
 * 
 */

/**
 * @author Laptop
 *
 */
public interface CRadio {
	public String cambiarAm();
	public String cambiarFm();
	public boolean cambiarAmFm(String AmFm);
	public boolean encendido();
	public void guardar(int boton, double estacion, double estaciones[]);
	public double seleccionar(int boton, double estacion, double estaciones[]);
	public double estacion(boolean AmFm, boolean boton, double estacion);
}
