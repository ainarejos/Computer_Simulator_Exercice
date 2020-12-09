public class Coche_Ismael_Martin extends CotxeAbstracte{
    //Attriubutes
    private EstatsMotorCotxe estado= EstatsMotorCotxe.Aturat;

    //Builder
    /**Costructor de la clase*/
    public Coche_Ismael_Martin(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    //Getters/Setters
    //Other Methods
    /**Arrancamos el motor del coche*/
    public void arrancarMotor() throws Exception {
        /** Lanzamos una excepción si el motor ya esta en marcha*/
        if (estado.equals(EstatsMotorCotxe.EnMarxa)){
            throw new Exception("El motor ya esta encendido");
        }
        this.estado=EstatsMotorCotxe.EnMarxa;
    }
    /**Comprovamos si elestado del motor si esta encendidio o no*/
    public EstatsMotorCotxe comprovaMotor() {
        return estado;
    }
    /**Mostramos las revoluciones a las que va el motor*/
    public int getRevolucions() {
        /**Comprovamos si el motor esta encendido o no y devolvemos un valor cer en el caso de apagado o un numero aleatorio en caso de estar encendidio*/
        int revoluciones=0;
        if (estado.equals(EstatsMotorCotxe.Aturat)){
            revoluciones=0;
        }else if (estado.equals(EstatsMotorCotxe.EnMarxa)){
            revoluciones= (int)(Math.random()*6500+1);/**Las revoluciones han de estar entre 1 y 6500*/
        }

        return revoluciones;
    }
    /**Apagamos el motor del coche*/
    public void aturarMotor() throws Exception {
        if (estado.equals(EstatsMotorCotxe.Aturat)){
            throw new Exception("El coche ya esta apagado");
        }
        this.estado=EstatsMotorCotxe.Aturat;
    }
}
