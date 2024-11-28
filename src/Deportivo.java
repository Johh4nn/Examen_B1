import java.util.Scanner;

public class Deportivo extends  Automovil{
    private int velocidadMaxima;
    private String tipoDeMotor;
    private boolean tieneSpoiler;


    public Deportivo( String marca, int anio, int nmRuedas, boolean tienetraccion4x4, String tipoTerreno, int numpuertas, boolean tieneAireacondiconado, String tipocombustible, int velocidadMaxima, String tipoDeMotor, boolean tieneSpoiler) {
        super( marca, anio, nmRuedas, tienetraccion4x4, tipoTerreno, numpuertas, tieneAireacondiconado, tipocombustible);
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDeMotor = tipoDeMotor;
        this.tieneSpoiler = tieneSpoiler;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public void setTipoDeMotor(String tipoDeMotor) {
        this.tipoDeMotor = tipoDeMotor;
    }

    public boolean isTieneSpoiler() {
        return tieneSpoiler;
    }

    public void setTieneSpoiler(boolean tieneSpoiler) {
        this.tieneSpoiler = tieneSpoiler;
    }

    public void aumentarVelocidad() {
        try {
            System.out.println("La velocidad  del automóvil " + getMarca() + " " + getTipo() + " se aumentando..");
            // Simulamos una posible excepción
            if (velocidadMaxima > 200) {
                throw new Exception("Error: El automóvil no puede exeder la velocidad .");
            }
            System.out.println("La velocidad del auto aumento");
        } catch (Exception e) {
            System.out.println("Excepción al abrir el maletero: " + e.getMessage());
        }
    }


    public void cambioSpoiler() {
            Scanner input = new Scanner(System.in);

            try{
                System.out.println("El spoiler del automóvil " + getMarca() + " " + getAnio() + " se está cambiando...");
                String nuevoSpoiler = input.nextLine();
                if(nuevoSpoiler.isEmpty()){
                    System.out.println("Ingreso mal el nuevo Spoiler no tiene nada ");
                    nuevoSpoiler = input.nextLine();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

    }

}
