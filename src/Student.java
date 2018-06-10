public class Student extends Person{

    private double sredniaOcen;
    private boolean obecnosc;

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public boolean isObecnosc() {
        return obecnosc;
    }

    public void setObecnosc(boolean obecnosc) {
        this.obecnosc = obecnosc;
    }

    public Student(String imie, String nazwisko, double sredniaOcen, boolean obecnosc) {
        super(imie, nazwisko);
        this.sredniaOcen = sredniaOcen;
        this.obecnosc = obecnosc;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Srednia ocen: "+getSredniaOcen()+ "Obczenosc: "+isObecnosc() );
    }
}
