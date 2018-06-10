public class Teacher extends  Person {
    int indeksNauczyciela;

    public Teacher(String imie, String nazwisko, int indeksNauczyciela) {
        super(imie, nazwisko);
        this.indeksNauczyciela = indeksNauczyciela;
    }

    public int getIndeksNauczyciela() {

        return indeksNauczyciela;
    }

    public void setIndeksNauczyciela(int indeksNauczyciela) {
        this.indeksNauczyciela = indeksNauczyciela;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Indeks nauczyciela: "+ getIndeksNauczyciela());
    }

}
