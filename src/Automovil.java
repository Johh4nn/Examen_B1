public class Automovil extends Terrestre {
    private int numpuertas;
    private boolean tieneAireacondiconado;
    private String tipocombustible;

    public Automovil( String marca, int anio, int nmRuedas, boolean tienetraccion4x4, String tipoTerreno, int numpuertas, boolean tieneAireacondiconado, String tipocombustible) {
        super( marca, anio, nmRuedas, tienetraccion4x4, tipoTerreno);
        this.numpuertas = numpuertas;
        this.tieneAireacondiconado = tieneAireacondiconado;
        this.tipocombustible = tipocombustible;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public boolean isTieneAireacondiconado() {
        return tieneAireacondiconado;
    }

    public void setTieneAireacondiconado(boolean tieneAireacondiconado) {
        this.tieneAireacondiconado = tieneAireacondiconado;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }



    public void abrirMaletero() {
        try {
            System.out.println("El maletero del automóvil " + getMarca() + " " + getTipo() + " se está abriendo...");
            // Simulamos una posible excepción
            if (numpuertas < 2) {
                throw new Exception("Error: El automóvil no tiene maletero o no se puede abrir.");
            }
            System.out.println("El maletero se ha abierto correctamente.");
        } catch (Exception e) {
            System.out.println("Excepción al abrir el maletero: " + e.getMessage());
        }
    }


    public void cerrarMaletero() {
        try {
            System.out.println("El maletero del automóvil " + getMarca() + " " + getAnio() + " se está cerrando...");
            // Simulamos una posible excepción
            if (numpuertas < 2) {
                throw new Exception("Error: El maletero no puede cerrarse.");
            }
            System.out.println("El maletero se ha cerrado correctamente.");
        } catch (Exception e) {
            System.out.println("Excepción al cerrar el maletero: " + e.getMessage());
        }
    }

}
