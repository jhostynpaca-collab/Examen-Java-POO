public class Mago extends Personaje {
    public Mago(int id, String nombre, int nivel) {
        super(id, nombre, nivel);
    }

    @Override
    public String realizarAccion() {
        return "El Mago lanza un hechizo.";
    }
}
