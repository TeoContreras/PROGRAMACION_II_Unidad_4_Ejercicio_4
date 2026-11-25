package SUBclases;

import SUPERclases.ProcesadorPago;

public class PagoBilleteraDigital extends ProcesadorPago {
    public PagoBilleteraDigital(double monto){
        super(monto);
    }
    private double saldo;
    @Override
    public boolean efectuarCobro(double monto) {
        System.out.println(saldo<monto ? "Pago aprobado" : "Error al concretas el pago. Saldo insuficiente");
        return !(saldo < monto);
    }
}
