package SUBclases;

import SUPERclases.ProcesadorPago;

public class PagoCripto extends ProcesadorPago {
    private String tokenExterno;
    public PagoCripto(double monto,String tokenExterno){
        super(monto);
        this.tokenExterno=tokenExterno;
    }
    String tokenInterno="1234";
    @Override
    public boolean efectuarCobro(double monto) {
        return tokenInterno==tokenExterno;
    }
}

