package modelo;

public class serie extends titulo {
    private int temporadas;

    private int episodiosPorTemporada;

    private int duracionEnMinutosPorEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;


    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpidosdiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpidosdiosPorTemporada(int epidosdiosPorTemporada) {
        this.episodiosPorTemporada = epidosdiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }
}
