package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import uniandes.dpoo.taller0.consola.ConsolaOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class modificacion {

	
	public static void main(String[] args) 
	{
		System.out.println("Hola mundo!");
		ejecutarAplicacion();
	}
	
	public static void ejecutarAplicacion()
	{
		ejecutarCargaDatos();
	}
	
	private static void ejecutarCargaDatos()
	{
		String archivo = "./data/atletas.csv";
		try {
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo(archivo); 
			System.out.println("El pais con mayor cantidad de medallas es "
					+ calc.paisConMasMedallistas().keySet() + " con un total de "
					+ calc.paisConMasMedallistas().values());
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: el archivo indicado no se encontró.");
		} 
		catch (IOException e) 
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
		}
		
		
	}
}
