package prendas;

public class Prenda {
    private double precioBase;
    private EstadoPrenda estadoPrenda;
    private String tipo;

    public Prenda(String tipo, double precioBase, EstadoPrenda estadoPrenda) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estadoPrenda = estadoPrenda;
    }

    public double precio() {
        return estadoPrenda.precioFinal(this.precioBase);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setEstadoPrenda(EstadoPrenda estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public EstadoPrenda getEstadoPrenda() {
        return estadoPrenda;
    }




}
