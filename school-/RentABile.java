import java.text.BreakIterator;
import java.util.ArrayList;


public class RentABile {
    ArrayList<Bike> bikes;
 

    public RentABile() {
        this.bikes = new ArrayList <Bike>();
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }
    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }
    

    public void mostraDisponibili() {
        System.out.println("Bikes disponibili:");
        for (Bike bike : bikes) {
            if (bike.isDisponibile()) {
                System.out.println(bike);
            }
        }
    }

    public int noleggiaBike(int id) {
        for (Bike bike : bikes) {
            if (bike.getId() == id && bike.isDisponibile()) {
                bike.setDisponibile(false);
                return 0; // Noleggio riuscito
            }
        }
        return -1; // Bike non trovata o non disponibile
    }

    public int rientroBike(int id) {
        for (Bike bike : bikes) {
            if (bike.getId() == id && !bike.isDisponibile()) {
                bike.setDisponibile(true);
                return 0; // Rientro riuscito
            }
        }
        return -1; // Bike non trovata o già disponibile
    }

    public void mostraEbike() {
        System.out.println("E-bikes inventariate:");
        for (Bike bike : bikes) {
            if (bike instanceof Ebike) {
                System.out.println(bike);
            }
        }
    }
}
