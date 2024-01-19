
public class Vozilo {
	private int brzina;
    private int kapacitetNaGorivo;

    
    public Vozilo(int brzina, int kapacitetNaGorivo) {
        this.brzina = brzina;
        this.kapacitetNaGorivo = kapacitetNaGorivo;
    }

    
    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public int getKapacitetNaGorivo() {
        return kapacitetNaGorivo;
    }

    public void setKapacitetNaGorivo(int kapacitetNaGorivo) {
        this.kapacitetNaGorivo = kapacitetNaGorivo;
    }

}
