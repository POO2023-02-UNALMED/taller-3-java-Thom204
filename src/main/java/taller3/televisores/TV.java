package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private static int numTV=0;

    Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public Marca getMarca() {
        return this.marca;
    }
    public int getCanal() {
        return this.canal;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public Control getControl(){
        return this.control;
    }
    public boolean getEstado(){
        return this.estado;
    }

    public void setMarca(Marca marca){
        this.marca=marca;
    }
    public void setCanal(int canal){
        if (this.estado){
            if (canal>0 && canal<=120){
                this.canal=canal;
            }
        }
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setVolumen(int volumen){
        if (this.estado){
            if (volumen<=7 && volumen>=0){
                this.volumen=volumen;
            }
        }
    }
    public void setControl(Control control){
        this.control=control;
    }

    public void turnOn(){
        if(!this.estado){
            this.estado=true;
        }
    }
    public void turnOff(){
        if(this.estado){
            this.estado=false;
        }
    }
    public void canalUp(){
        if (this.estado && this.canal<120){
            this.canal++;
        }
    }
    public void canalDown(){
        if(this.estado && this.canal>1) {
            this.canal--;
        }
    }
    public void volumenUp(){
        if (this.estado && this.volumen<7){
            this.volumen++;
        }
    }
    public void volumenDown(){
        if (this.estado && this.volumen>=1){
            this.volumen--;
        }
    }

    public static void setNumTV(int numTV){
        TV.numTV=numTV;
    }
    public static int getNumTV(){
        return TV.numTV;
    }
}