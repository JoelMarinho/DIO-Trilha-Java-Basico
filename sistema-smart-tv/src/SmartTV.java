public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        // canal = +1;
        canal++;

    }

    public void diminuirCanal() {
        // canal = -1;
        canal--;

    }

    public void aumentarVolume() {
        // volume = +1;
        volume++;
        System.out.println("Aumentar o volume para: " + volume);

    }

    public void diminuirVolume() {
        // volume -1;
        volume--;
        System.out.println("Diminuir o volume para: " + volume);

    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}