import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class MetodosBusqueda{

	long t = 0; 
	long c = 0;
	long in = 0;
	long r = 0;
	int busquedaBinaria(int vector[], int posicionIzq, int posicionDer, int elementoA_Buscar) { 
		t = System.nanoTime();     
		for (int i = 0; i < vector.length; i++) {
			r++;
		}
		for (int i = 0; i < vector.length; i++) {
		in++;
		if (posicionDer >= posicionIzq) { 
	            int mitad = posicionIzq + (posicionDer - posicionIzq) / 2; 
	            
	            if (vector[mitad] == elementoA_Buscar) 
	                return mitad; 
	            
	            if (vector[mitad] > elementoA_Buscar) 
	                return busquedaBinaria(vector, posicionIzq, mitad - 1, elementoA_Buscar); 
	            
	            return busquedaBinaria(vector, mitad + 1, posicionDer, elementoA_Buscar); 
	        }
	}
		c++;
	        
	        return -1;
	
	        
	   }
	public  int busquedaSecuencial(int []arreglo,int dato){
		t = System.nanoTime(); 
		for (int i = 0; i < arreglo.length; i++) {
			r++;
		}
		
		int posicion = -1;
		  for(int i = 0; i < arreglo.length; i++){
		      if(arreglo[i] == dato){
		    posicion = i;
		    break;//
		   }
		      in++;
		 }c++;
		return posicion;
	}
	

}
public class MetodosDeBusqueda {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		MetodosBusqueda ob = new MetodosBusqueda();
		boolean a= true;
		int arr[] = new int[100];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {

			arr[i] = r.nextInt(100);
		}
		int n = arr.length;
		int ar[] = Arrays.copyOf(arr, arr.length);
		System.out.println("Cual metodo de busca desea utilizar:  \n1) Busqueda Secuencial\n2) Busqueda Binaria");
		byte opc= e.nextByte();
		
		do {
			ob.c=0;
			ob.in=0;
			ob.r=0;
			ob.t=0;
			
			switch (opc) {
			case 1:
				System.out.println("buscar elemento por el metodo Busqueda Secuencial");
				System.out.println("Ingrese un valor de el 0 al 99 para buscar");
				ob.t = System.nanoTime();
				int var1 = ob.busquedaSecuencial(arr, e.nextInt());
				System.out.println("posicion: ");
				if (var1 == -1) {
					System.out.println("No se encontro");
				}else {
					System.out.println(var1);
				}
				System.out.println("Tiempo de ejecucion: " + (System.nanoTime() - ob.t));
				System.out.println("Comparaciones: " + ob.c);
				System.out.println("Recorridos: " + ob.r);
				System.out.println("Intercambios: " + ob.in);
				break;

			
		case 2:
			System.out.println("buscar elemento por el metodo Busqueda Binaria");
			System.out.println("Ingrese un valor de el 0 al 99 para buscar");
			ob.t = System.nanoTime();
			int var = ob.busquedaBinaria(arr, 0, arr.length-1, e.nextInt());
			System.out.println("posicion: ");
			if (var == -1) {
				System.out.println("No se encontro");
			}else {
				System.out.println(var);
			}
			System.out.println("Tiempo de ejecucion: " + (System.nanoTime() - ob.t));
			System.out.println("Comparaciones: " + ob.c);
			System.out.println("Recorridos: " + ob.r);
			System.out.println("Intercambios: " + ob.in);
			// System.out.println(Arrays.toString(arr));
			break;
		default:
			break;
		}
		}while(a);
		
	}
}
	