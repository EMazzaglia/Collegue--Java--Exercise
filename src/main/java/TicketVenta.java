import java.util.ArrayList;
import java.util.List;

public class TicketVenta {
    private List<ItemVenta> itemsTicket = new ArrayList<>();
    private MedioDePago medioDePago;
    private double total;

    public TicketVenta(List<ItemVenta> itemsTicket, MedioDePago medioDePago) {
        this.itemsTicket = itemsTicket;
        this.medioDePago = medioDePago;
    }

}
