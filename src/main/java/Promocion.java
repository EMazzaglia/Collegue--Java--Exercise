public class Promocion implements EstadoPrenda {

    private double valorFijo = 5.0;

    @Override
    public double precioFinal(double precioBase) {
        return precioBase - getValorFijo();
    }

    public void setValorFijo(double nuevoValorFijo){
        this.valorFijo = nuevoValorFijo;
    }

    public double getValorFijo() {
        return this.valorFijo;
    }
}
