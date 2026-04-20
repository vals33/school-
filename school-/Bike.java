/*Un'attività di noleggio biciclette ha deciso di realizzare un'applicazione per la gestione del proprio servizio. In una prima fase di sviluppo è stata commissionata la creazione del software che dovrà rappresentare il proprio parco mezzi. A questo scopo viene predisposta la classe Bicicletta che memorizza per ogni bicicletta: marca, modello, taglia del telaio, il numero identificativo assegnato e lo stato (disponibile o noleggiata) oltre a tutti i metodi opportuni.Viene inoltre prevista una classe derivata EBike. Come noto le e-bike sono dotate di una batteria e di un motore in grado di assistere la pedalata; per questo tipo di cicli viene memorizzata: l'autonomia massima teorica (in km) e di quanti livelli di assistenza alla pedalata disponga (i valori andranno da 1 a un massimo che potrà variare da una all'altra bici). 
Viene quindi modellata una classe RentABike che gestisce le attività di noleggio delle bicilette tramite un ArrayList. Quest'ultima classe, oltre a tutti i metodi necessari a gestire le biciclette destinate al noleggio, disporrà dei seguenti metodi:
mostraDisponibili(): mostra a schermo tutte le biciclette disponibili (non noleggiate) complete delle proprie caratteristiche
noleggiaBike (int id): che permette a partire dal numero identificativo di noleggiare una bicicletta impostando lo stato di conseguenza.
rientroBike (int id): che permette a partire dal numero identificativo di segnare come nuovamente disponibile una bicicletta impostando lo stato di conseguenza.
mostraEBike(): mostra a schermo tra tutte le bici inventariate solamente le e-bike  
Predisporre un programma di test che attraverso un apposito menù consenta di verificare la corretta funzionalità di quanto progettato e permetta di archiviare in modo non volatile i dati raccolti. */

public class Bike {
    private String marca;
    private String modello;
    private String taglia;
    private int id;
    private boolean disponibile;

    public Bike(String marca, String modello, String taglia, int id) {
        this.marca = marca;
        this.modello = modello;
        this.taglia = taglia;
        this.id = id;
        this.disponibile = true;
    }

    // Getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
    @Override
    public String toString() {
        return "Bike{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", taglia='" + taglia + '\'' +
                ", id=" + id +
                ", disponibile=" + disponibile +
                '}';
    }
    
}
