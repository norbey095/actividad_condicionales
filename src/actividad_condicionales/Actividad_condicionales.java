package actividad_condicionales;
import java.util.Scanner;

public class Actividad_condicionales {

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			String nombre;
			float valor_compra, descuento = 0;
			
			System.out.print("Ingrese el nombre del cliente: ");
			nombre = sc.nextLine();
			
			System.out.print("Ingrese el valor de la compra: ");
			valor_compra = sc.nextFloat();
			
			//condicionales para el descuento
			if(valor_compra < 80000){
			    descuento = 0;
			}else if(valor_compra >= 80000 && valor_compra < 170000){
			    descuento = (float) 0.1;
			}else if(valor_compra >= 170000 && valor_compra < 350000){
			    descuento = (float) 0.15;
			}else if(valor_compra >= 350000 && valor_compra < 600000){
			    descuento = (float) 0.2;
			}  
			    
			//se hace las operaciones
			float precio_final = valor_compra - (valor_compra * descuento);
			
			System.out.println(
			        "Nombre del cliente: " + nombre + "\n" +
			        "Valor de la compra: " + valor_compra + "\n" +
			        "Valor de la compra con descuento: " + precio_final);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }    
}