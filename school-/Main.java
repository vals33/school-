/*Predisporre un programma di test che attraverso un apposito menù consenta di verificare
 la corretta funzionalità di quanto progettato e permetta di archiviare in modo non volatile i dati raccolti. */

public class Main {
    public static void main(String[] args) {
        RentABile rentABile = new RentABile();

        // Aggiunta di alcune bike
        rentABile.getBikes().add(new Bike("Marca1", "Modello1", "M", 1));
        rentABile.getBikes().add(new Bike("Marca2", "Modello2", "L", 2));
        rentABile.getBikes().add(new Ebike("Marca3", "Modello3", "S", 3, 50));

        // Mostra le bike disponibili
        rentABile.mostraDisponibili();

        // Noleggia una bike
        int result = rentABile.noleggiaBike(1);
        if (result == 0) {
            System.out.println("Noleggio riuscito per la bike con ID 1.");
        } else {
            System.out.println("Noleggio fallito per la bike con ID 1.");
        }

        // Mostra le bike disponibili dopo il noleggio
        rentABile.mostraDisponibili();

        // Rientro della bike
        result = rentABile.rientroBike(1);
        if (result == 0) {
            System.out.println("Rientro riuscito per la bike con ID 1.");
        } else {
            System.out.println("Rientro fallito per la bike con ID 1.");
        }

        // Mostra le e-bike inventariate
        rentABile.mostraEbike();
    }
}

