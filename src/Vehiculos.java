import java.util.Scanner;

public class Vehiculos {
    private String tipo;
    private String marca;
    private int anio;

    Vehiculos(String tipo, String marca, int anio){
        this.tipo = tipo;
        this.marca = marca;
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }
    public int getAnio() {
        return anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirInfo(){
        System.out.println("---------Mostrar informacion--------------");
        System.out.println("Tipo: " + tipo+"\nMarca: " + marca+"\nAño: " + anio);
    }

    public void cambiarAnio(){
        try{
            System.out.println("Desea cambia el año ? (Digite 1 o O para cancelar).");
            Scanner sc = new Scanner(System.in);
            int digito = sc.nextInt();
            if(digito == 1){
                System.out.println("Digite el año de vehiculo: ");
                setAnio(sc.nextInt());
                System.out.println("Año del vehiculo: " + getAnio());
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());}
    }

}
