package prendas;

import java.time.LocalDate;

public class Item {
    private Prenda prenda;
    private int cantidad;
    private LocalDate fechaVenta;

    public Item(Prenda prenda, int cantidad, LocalDate fechaVenta) {
        this.prenda = prenda;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}
