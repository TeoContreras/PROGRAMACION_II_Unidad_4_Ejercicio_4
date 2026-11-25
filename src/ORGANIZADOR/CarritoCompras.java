package ORGANIZADOR;

import SUPERclases.ProcesadorPago;

public class CarritoCompras {

    public void finalizarCompra(ProcesadorPago pasarela, double total) {
        boolean aprobado = pasarela.efectuarCobro(total);
        if (aprobado) {
            System.out.println("Pago aprobado por $" + total);
        } else {
            System.out.println("Pago rechazado");
        }
    }
}
