public class Terrestre extends Vehiculos {
    private int nmRuedas;
    private boolean Tienetraccion4x4;
    private String tipoTerreno;


    public Terrestre( String marca, int anio, int nmRuedas, boolean tienetraccion4x4, String tipoTerreno) {
        super("Terrestre", marca, anio);
        this.nmRuedas = nmRuedas;
        Tienetraccion4x4 = tienetraccion4x4;
        this.tipoTerreno = tipoTerreno;
    }


    public int getNmRuedas() {
        return nmRuedas;
    }

    public void setNmRuedas(int nmRuedas) {
        this.nmRuedas = nmRuedas;
    }

    public boolean isTienetraccion4x4() {
        return Tienetraccion4x4;
    }

    public void setTienetraccion4x4(boolean tienetraccion4x4) {
        Tienetraccion4x4 = tienetraccion4x4;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }


    public void cambiarTipoTerreno(String nuevoTipo) {
        try {
            if (nuevoTipo == null || nuevoTipo.isEmpty()) {
                throw new Exception("Error: El tipo de terreno no puede ser vacío.");
            }
            this.tipoTerreno = nuevoTipo;
            System.out.println("Tipo de terreno cambiado a: " + nuevoTipo);
        } catch (Exception e) {
            System.out.println("Excepción al cambiar el tipo de terreno: " + e.getMessage());
        }
    }


    public void revisarRuedas() {
        try {
            if (nmRuedas <= 0) {
                throw new Exception("Error: El número de ruedas es inválido.");
            }
            System.out.println("El vehículo tiene " + nmRuedas + " ruedas y están en buen estado.");
        } catch (Exception e) {
            System.out.println("Excepción al revisar las ruedas: " + e.getMessage());
        }
    }

}
