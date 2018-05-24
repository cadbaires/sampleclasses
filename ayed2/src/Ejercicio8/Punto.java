package Ejercicio8;

/**
 * Created by CarlosAdrián on 24/05/2018.
 */
public class Punto{

    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }


    private void setPunto(float abscisa, float coordenada){
        this.x=abscisa;
        this.y=coordenada;
    }
    
    float getX(){
        return this.x;
    }

    float getY(){
        return this.y;
    }

    Punto sumarPunto(Punto p2) {
        return new Punto(this.getX() + p2.getX(), this.getY() + p2.getY());
    }

    boolean igual(Punto p2){
        return (this.getX()== p2.getX()) && ((this.getY()==p2.getY()));
    }

}
