import ORGANIZADOR.CarritoCompras;
import SUBclases.PagoBilleteraDigital;
import SUBclases.PagoCripto;
import SUBclases.PagoTarjetaCredito;
import SUPERclases.ProcesadorPago;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        List<ProcesadorPago> elementos = new ArrayList<>();
        elementos.add(new PagoCripto(1500,"1234"));
        elementos.add(new PagoBilleteraDigital(50000));
        elementos.add(new PagoTarjetaCredito(300));

        for (ProcesadorPago p : elementos) {
            carrito.finalizarCompra(p, 10000.0);
        }
    }
}
