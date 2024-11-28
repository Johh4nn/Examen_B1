//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculos veh1= new Vehiculos("Areo","jetfk7",2024);

        veh1.cambiarAnio();

        veh1.imprimirInfo();

        Terrestre Terr1 = new Terrestre("Hino",2018,6,false,"asfalto");

        Terr1.cambiarTipoTerreno("pedrado");
        Terr1.revisarRuedas();

        Automovil auto1= new Automovil("ford",2020,4,true,"asfalto",4,true,"diesel");

        auto1.abrirMaletero();
        auto1.cerrarMaletero();

        Deportivo deport1= new Deportivo("mercedez",2022,4,false,"asfalto",2,true,"super",
                250,"combustion_inverter",true);
        deport1.aumentarVelocidad();
        deport1.cambioSpoiler();
    }
}