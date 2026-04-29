
import static org.junit.jupiter.api.Assertions.*;

import org.example.Carrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;

public class carritoTest {

    @Test
    void carritoRecienCreadoEstaVacio() {

        Carrito carrito = new Carrito();

        assertTrue(carrito.estadoVacio());
    }

    @Test
    void agregarProductoCantidadEsUno() {

        Carrito carrito = new Carrito();
        Producto producto = new Producto("Cuaderno", 5000, 5);

        carrito.agregar(producto);

        assertEquals(1, carrito.cantidadDeProductos());
    }

    @Test
    void totalDosProductosEsLaSuma() {

        Carrito carrito = new Carrito();

        Producto p1 = new Producto("Lapiz", 100, 5);
        Producto p2 = new Producto("Borrador", 200, 5);

        carrito.agregar(p1);
        carrito.agregar(p2);

        assertEquals(300, carrito.calcucularTotal());
    }

    @Test
    void carritoConProductoNoEstaVacio() {

        Carrito carrito = new Carrito();
        Producto producto = new Producto("Libro", 1000, 2);

        carrito.agregar(producto);

        assertFalse(carrito.estadoVacio());
    }

    @Test
    void carritoVacioTotalEsCero() {

        Carrito carrito = new Carrito();

        assertEquals(0, carrito.calcucularTotal());
    }

    // PRUEBA LIBRE
    @Test
    void agregarDosProductosCantidadEsDos() {

        Carrito carrito = new Carrito();

        carrito.agregar(new Producto("A", 100, 1));
        carrito.agregar(new Producto("B", 200, 1));

        assertEquals(2, carrito.cantidadDeProductos());
    }
}