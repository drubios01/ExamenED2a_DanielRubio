package examen;
/**
 * La clase fecha contiene el metodo validarFecha que comprueba si una feche es validad o no
 * @author Daniel Rubio
 * @version 1.0
 */
public class Fecha {
	/**
	 * Variablr boolean que devolvera si la fecha es valida o no
	 */
	public static boolean fechaValida;

	/**
	 * El metodo validarFecha comprueba si una fecha es valida o no
	 * @param anio Variable que contiene el año de la fehca a validar
	 * @param mes Variable que contiene el mes de la fehca a validar
	 * @param dia Variable que contiene el dia de la fehca a validar
	 * @return Devuelve true o false dependiendo de si la fecha es valida o no
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}
