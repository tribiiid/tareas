import java.util.HashSet;
import java.util.Set;

public class EjemploReservas {
    public static void main(String[] args) {
        // 1. Crear el HashSet
        Set<String> conjuntoReservas = new HashSet<>();

        // 2. Agregar elementos
        conjuntoReservas.add("mesa 1");
        conjuntoReservas.add("mesa 2");
        conjuntoReservas.add("mesa 3");

        // Intentar agregar un duplicado
        boolean seAgrego = conjuntoReservas.add("mesa 1");
        System.out.println("¿Se pudo agregar mesa 1 de nuevo? " + seAgrego);

        System.out.println("Reservas actuales: " + conjuntoReservas);

        // 3. Comprobar si existe un elemento
        if (conjuntoReservas.contains("mesa 2")) {
            System.out.println("La mesa 2 tiene una reserva activa");
        }

        // 4. Eliminar un elemento
        conjuntoReservas.remove("mesa 3");
        System.out.println("Después de eliminar la mesa 3: " + conjuntoReservas);

        // 5. Tamaño del conjunto
        System.out.println("Total de reservas: " + conjuntoReservas.size());
    }
}
