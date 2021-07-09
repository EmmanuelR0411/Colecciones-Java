import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * La coleccion Set no puede contener elementos duplicados, solo tiene 
		 * los metodos heredados de coleccio, existen diferentes tipos de 
		 * implementaciones 
		 * 
		 * HashSet: Esta implementacion almacena los elementos en una tabla hash
		 * Es la que mejor rendimiento tiene (los elementos no tienen un orden)
		 * (mas eficiente)
		 * 
		 * TreeSet: Te permite acceder a ellos de manera general y no individual
		 * ordena de mayor a menor
		 * (menos eficientemente)
		 * 
		 * LinkedHashSet: REspeta el orden de insercion 
		 */
		
		Set<String> frutas = new HashSet<String>();//Solo se cambia el HAshSet por TreeSet u otro
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");
		
//		Con este tipo de for recorremos todos los elemntos del arreglo
//		HashSet no muestra a los elementos en orden
		for (String fruta: frutas) {
			System.out.println(fruta);
		}

		System.out.println(frutas.contains("Mango"));
		System.out.println(frutas.size());

		/*
		 * La interfaz List define una sucesion de elementos 
		 * Si admite elemntos duplicados 
		 * Añade nuevos metodos que podemos usar
		 * Acceso posicional a elementos
		 * Busqueda de elemntos
		 * Rango de operacion
		 * 
		 * Implementaciones:
		 * ArrayList
		 * LinkedList
		 */
		
		System.out.println("\n \nLIST");
		
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");
		frutas2.add("Mango");//Acepta elementos repetidos
		
		for (String fruta2: frutas2) {
			System.out.println(fruta2);
		}
//		Preguntamos en que posicion esta nuestro elemento
		int pera = frutas2.indexOf("Pera");
		
		System.out.println("Imprime mediante indice a: " + frutas2.get(pera) + 
				", que tiene el indice: " + pera);
		
//		SE declara como integer ya que este es un objeto y seria para poder 
//		almacenar numeros como si fuera un int. int = dato primitivo integer= objeto 
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(1234);
		agenda.add(456);
		
		for(Integer a: agenda) {
			System.out.println(a);
		}
		
//		LinkedList, en esto los elementos estan enlazados doblemente, esto 
//		significa que cada elemento sabe quien esta antes y despues de el, esto 
//		ayuda al momento de agregar o quitar elementos
		List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		System.out.println("\n\n");
		for(String animal: animales) {
			 System.out.println(animal);
		}
		
		/*
		 * La interfaz Map asocia claves a valores 
		 * No puede obtener claves duplicadas y cada clave solo puede tener 
		 * asociado un valor 
		 * 
		 * Implementaciones:
		 * HashMap: No ordena
		 * TreeMap: Ordena por claves
		 * LinkedHashMap: Ordena por insercion
		 */
		
		Map<String, String> diccionario = new HashMap<String, String>();
//		Se almacena indicando la clave y el valor del elemento
//		diccionario.put(clave,valor);
		diccionario.put("elemento1", "Carlos Eduardo");
		diccionario.put("telefono", "12121212");
		diccionario.put("llave", "true");
		
//		Al solicitar un elemento se le tiene que proporcionar la llave (clave)
		System.out.println("\nLa clave es elmento1 y el valor es: "
				+ diccionario.get("elemento1"));
		
//		Recooremos los elemntos map
		System.out.println("Ordenamiento sin importancia con HashMap");
		diccionario.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		
//		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
//		    System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
//		}
		
		/*
		 * Implementacion
		 * TreeMap
		 */
		Map<String, String> diccionario2 = new TreeMap<String, String>();
//		Se almacena indicando la clave y el valor del elemento
//		diccionario.put(clave,valor);
		diccionario2.put("elemento1", "Carlos Eduardo");
		diccionario2.put("telefono", "12121212");
		diccionario2.put("llave", "true");
		
//		Al solicitar un elemento se le tiene que proporcionar la llave (clave)
		System.out.println("\nLa clave es elmento1 y el valor es: "
				+ diccionario2.get("elemento1"));
		
//		Recooremos los elemntos map
		System.out.println("Ordenamiento por claves con TreeMap");
		diccionario2.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		
		/*
		 * LinkedHashMap
		 */
		Map<String, String> diccionario3 = new LinkedHashMap<String, String>();
//		Se almacena indicando la clave y el valor del elemento
//		diccionario.put(clave,valor);
		diccionario3.put("elemento1", "Carlos Eduardo");
		diccionario3.put("telefono", "12121212");
		diccionario3.put("llave", "true");
		
//		Al solicitar un elemento se le tiene que proporcionar la llave (clave)
		System.out.println("\nLa clave es elmento1 y el valor es: "
				+ diccionario3.get("elemento1"));
		
//		Recooremos los elemntos map
		System.out.println("Ordenamiento por insersion con LinkedHashMap");
		diccionario3.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
		
		
	}

}
