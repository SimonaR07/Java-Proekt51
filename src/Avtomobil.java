

	class Avtomobil extends Vozilo {
	    private int brojNaVrati;
	    

	    
	    public Avtomobil(int brzina, int kapacitetNaGorivo, int brojNaVrati) {
	        super(brzina, kapacitetNaGorivo);
	        this.brojNaVrati = brojNaVrati;
	    }

	   
	    public int getBrojNaVrati() {
	        return brojNaVrati;
	    }

	    public void setBrojNaVrati(int brojNaVrati) {
	        this.brojNaVrati = brojNaVrati;
	    }
