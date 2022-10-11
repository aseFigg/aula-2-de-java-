public class Bhaskara{
    
    int a;
    int b;
    int c;
    double delta;
    double x1;
    double x2;

    public void calculaDelta(){
        //.delta = b* - 4*a*c
        this.delta = (this.b * this.b) - (4 * this.a * this.c);
    }

    public void calcularx1(){
        this.x1 = ((-1 * this.b) + Math.sqrt(this.delta)) / (2 * this.a);    
    }

     public void calcularx2(){
        this.x2 = ((-1 * this.b) - Math.sqrt(this.delta)) / (2 * this.a);  
    }
}