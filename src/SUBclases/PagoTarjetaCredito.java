package SUBclases;

import SUPERclases.ProcesadorPago;

public class PagoTarjetaCredito extends ProcesadorPago {
    public PagoTarjetaCredito(double monto){
        super(monto);
    }
    private double saldo;
    @Override
    public boolean efectuarCobro(double monto) {
        System.out.println(saldo<monto ? "Pago aprobado" : "Pago rechazado. Saldo insuficiente");
        return !(saldo < monto);
    }
}
