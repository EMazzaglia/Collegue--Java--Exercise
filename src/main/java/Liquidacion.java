public class Liquidacion implements EstadoPrenda {

    private double porcentajeDescuento = 0.5;

    public double precioFinal(double precioBase) {
        return precioBase - (precioBase * getPorcentajeDescuento());
    }

    public double getPorcentajeDescuento() {
        return this.porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
