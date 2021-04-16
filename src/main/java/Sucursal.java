import java.time.LocalDate;

public class Sucursal {

    private double totalGanancias;
    private String nombreLocal;
    private int numeroSucursal;

    public Sucursal(String nombreLocal, int numeroSucursal){
    this.nombreLocal = nombreLocal;
    this.numeroSucursal= numeroSucursal;
    }

    public void registrarVenta(TicketVenta ticketVenta) {
        //Guarda la venta en una base de datos para persistencia
    }

//    public double totalGananciasPorDia(LocalDate diaRequerido){
//        // Trae de la base de datos el total en pesos para un dia requerido
//    }







}
