public class Ebike extends Bike {
    private int autonomia; // in km

    public Ebike(String marca, String modello, String taglia, int id, int autonomia) {
        super(marca, modello, taglia, id);
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Ebike{" +
                "marca='" + getMarca() + '\'' +
                ", modello='" + getModello() + '\'' +
                ", taglia='" + getTaglia() + '\'' +
                ", id=" + getId() +
                ", disponibile=" + isDisponibile() +
                ", autonomia=" + autonomia +
                '}';
    }
}