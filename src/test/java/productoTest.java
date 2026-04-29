import static org.junit.jupiter.api.Assertions.*;

import org.example.Producto;
import org.junit.jupiter.api.Test;

public class productoTest
{

    @Test
    void precioEsElDelConstructor()
    {
        // Organizar
        Producto producto = new Producto("Cuaderno", 5000, 10);

        // Actuar
        double precio = producto.getPrecio();

        // Afirmar
        assertEquals(5000, precio);
    }

    @Test
    void productoConStockMayorACeroDisponible()
    {
        Producto producto = new Producto("Lapiz", 2000, 5);

        assertTrue(producto.estaDisponible());
    }

    @Test
    void productoConStockCeroNoDisponible()
    {
        Producto producto = new Producto("Borrador", 1000, 0);

        assertFalse(producto.estaDisponible());
    }

    @Test
    void precioNegativoLanzaError() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Teclado", -1000, 5);
        });
    }

    // PRUEBA LIBRE
    @Test
    void stockNegativoLanzaError() {

        /*
         Qué comportamiento pruebo:
         No permitir stock negativo al crear producto.

         Qué aserción uso:
         assertThrows porque espero una excepción.

         Qué valor espero:
         IllegalArgumentException
        */

        assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Pantalla", 50000, -3);
        });
    }
}

