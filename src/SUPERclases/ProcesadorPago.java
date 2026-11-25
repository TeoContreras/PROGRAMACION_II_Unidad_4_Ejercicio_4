package SUPERclases;

public abstract class ProcesadorPago {
    private double monto;
    public ProcesadorPago(double monto){
        this.monto=monto;
    }
    public abstract boolean efectuarCobro(double monto);

}
